/*
 * @author Mauricio Chimento
 */
package bank;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Unit tests for the class UserInterface.
 */
public class UserInterfaceTest {

    public UserInterface f ;

    @Before
    public void setUp(){
        f = new UserInterface("test") ;
    }

    @After
    public void reset() {
        SystemCentral.flush();
    }

    @Test
    public void test_getUser(){
        assertNull(f.getUser());
    }

    @Test
    public void test_login_1(){
        User u = DataBase.search("checho",1);
        assertNull(f.getUser());
        assertNotNull(u);

        f.login("checho",1);
        assertEquals(u,f.getUser());
    }

    @Test
    public void test_login_2(){
        User u = DataBase.search("checho",1);
        assertNull(f.getUser());
        assertNotNull(u);

        f.login("checho",1);

        assertNotNull(f.getUser());

        f.login("supervisor",3);
        assertEquals(u,f.getUser());
    }

    @Test
    public void test_logout_1(){
        User u = DataBase.search("checho",1);
        assertNull(f.getUser());
        assertNotNull(u);

        f.login("checho",1);
        assertNotNull(f.getUser());

        f.logout();
        assertNull(f.getUser());
    }

    @Test
    public void test_logout_2(){
        assertNull(f.getUser());

        f.logout();
        assertNull(f.getUser());
    }

    @Test
    public void test_deposit_1(){
        User u = DataBase.search("checho",1);
        assertNull(f.getUser());
        assertNotNull(u);

        f.login("checho",1);

        int amount = f.getUser().getAccount().getBalance();
        f.deposit(20);

        int new_amount = f.getUser().getAccount().getBalance();
        assertEquals(amount + 20 , new_amount);
    }

    @Test
    public void test_deposit_2(){
        User u = DataBase.search("checho",1);
        assertNull(f.getUser());
        assertNotNull(u);

        f.login("checho",1);

        int amount = f.getUser().getAccount().getBalance();
        f.deposit(-20);

        int new_amount = f.getUser().getAccount().getBalance();
        assertEquals(amount , new_amount);
    }

    @Test
    public void test_deposit_3(){
        assertNull(f.getUser());
        f.deposit(20);

        assertNull(f.getUser());
    }

    @Test
    public void test_withdraw_1(){
        User u = DataBase.search("checho",1);
        assertNull(f.getUser());
        assertNotNull(u);

        f.login("checho",1);

        int amount = f.getUser().getAccount().getBalance();
        f.withdraw(20);

        int new_amount = f.getUser().getAccount().getBalance();
        assertEquals(amount - 20 , new_amount);
    }

    @Test
    public void test_withdraw_2(){
        User u = DataBase.search("checho",1);
        assertNull(f.getUser());
        assertNotNull(u);

        f.login("checho",1);

        int amount = f.getUser().getAccount().getBalance();
        f.deposit(-20);

        int new_amount = f.getUser().getAccount().getBalance();
        assertEquals(amount , new_amount);
    }

    @Test
    public void test_withdraw_3(){
        assertNull(f.getUser());
        f.withdraw(20);

        assertNull(f.getUser());
    }
}
