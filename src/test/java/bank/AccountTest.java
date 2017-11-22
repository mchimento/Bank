/*
 * @author Mauricio Chimento
 */
package bank;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Unit tests for the class Account.
 */
public class AccountTest {

    Account a ;

    @Before
    public void setUp() {
        a = new Account();
    }

    @Test
    public void test_getID(){
        assertTrue(a.getId() == 1);
    }

    @Test
    public void test_getBalance(){
        assertTrue(a.getBalance() == 0);
    }

    @Test
    public void test_getExtractionLimit(){
        assertTrue(a.getExtractionLimit() == 0);
    }

    @Test
    public void test_deposit(){
        a.deposit(42);

        assertTrue(a.getBalance() == 42);
    }

    @Test
    public void test_withdraw_1(){
        a.deposit(42);
        a.withdraw(10);

        assertTrue(a.getBalance() == 32);
    }

    @Test
    public void test_withdraw_2(){
        a.deposit(42);
        a.withdraw(50);

        assertTrue(a.getBalance() == 42);
        assertTrue(a.getExtractionLimit() == 0);
        assertTrue(a.getId() == 1);
    }

    @Test
    public void test_withdraw_3(){
        a.deposit(42);
        a.withdraw(-10);

        assertTrue(a.getBalance() == 42);
        assertTrue(a.getExtractionLimit() == 0);
        assertTrue(a.getId() == 1);
    }

    @Test
    public void test_transfer_1(){
        Account b = new Account();

        a.deposit(42);
        a.transfer(12,b);

        assertTrue(b.getBalance() == 12);
        assertTrue(a.getBalance() == 30);
    }

    @Test
    public void test_transfer_2(){
        Account b = new Account();

        a.deposit(42);
        a.transfer(50,b);

        assertTrue(b.getBalance() == 42);
        assertTrue(a.getBalance() == 0);
    }

    @Test
    public void test_transfer_3(){
        Account b = new Account();

        a.deposit(42);
        a.transfer(-10,b);

        assertTrue(b.getBalance() == 42);
        assertTrue(a.getBalance() == 0);
    }
}
