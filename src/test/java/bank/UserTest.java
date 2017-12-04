/*
 * @author Mauricio Chimento
 */
package bank;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Unit tests for the class User.
 */
public class UserTest {

    User u ;

    @Before
    public void setup(){
        u = new User("checho", "Mauricio","Chimento",1) ;
    }

    @Test
    public void test_getCategory(){
        assertEquals(u.getCategory(), Category.Type.Bronze);
    }

    @Test
    public void test_setCategory() {
        u.setCategory(Category.Type.Silver);
        assertTrue(u.getCategory() == Category.Type.Silver);
    }

    @Test
    public void test_getPassword() {
        assertEquals(u.getPassword(), 1);
    }

    @Test
    public void test_setPassword() {
        u.setPassword(2);
        assertEquals(u.getPassword(), 2);
    }

    @Test
    public void test_getUserName() {
        assertEquals(u.getUserName(),"checho");
    }

    @Test
    public void test_setUserName() {
        u.setUserName("piluso");
        assertEquals(u.getUserName(),"piluso");
    }

    @Test
    public void test_getName() {
        assertEquals(u.getName(),"Mauricio");
    }

    @Test
    public void test_setName() {
        u.setName("Jesus");
        assertEquals(u.getName(),"Jesus");
    }

    @Test
    public void test_getSurname() {
        assertEquals(u.getSurname(), "Chimento");
    }

    @Test
    public void test_setSurname() {
        u.setSurname("Rios");
        assertEquals(u.getSurname(),"Rios");
    }

    @Test
    public void test_getAccount(){
        assertNull(u.getAccount());
    }

    @Test
    public void test_setAccount(){
        Account a = new Account();
        u.setAccount(a);

        assertEquals(u.getAccount().getId(), a.getId());
    }
}
