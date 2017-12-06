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
        //the int value depends on the order in which the tests are executed.
        assertEquals(a.getId(), 9);
    }

    @Test
    public void test_getBalance(){
        assertEquals(a.getBalance(), 0);
    }

    @Test
    public void test_getExtractionLimit(){
        assertEquals(a.getExtractionLimit(), 0);
    }

    @Test
    public void test_setExtractionLimit(){
        a.setExtractionLimit(42);
        assertEquals(a.getExtractionLimit(),42);
    }

    @Test
    public void test_deposit_1(){
        a.deposit(42);

        assertEquals(a.getBalance(), 42);
    }

    @Test
    public void test_deposit_2(){
        int aux = a.getBalance();
        a.deposit(-42);

        assertEquals(a.getBalance(), aux);
    }

    @Test
    public void test_withdraw_1(){
        a.deposit(42);
        a.withdraw(10);

        assertEquals(a.getBalance(), 32);
    }

    @Test
    public void test_withdraw_2(){
        a.deposit(42);
        a.withdraw(50);

        assertEquals(a.getBalance(), 42);
    }

    @Test
    public void test_withdraw_3(){
        a.deposit(42);
        a.withdraw(-10);

        assertEquals(a.getBalance(),  42);
    }
}
