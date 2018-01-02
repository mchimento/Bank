/*
 * @author Mauricio Chimento
 */
package bank;

public class BankAdapter {

    public UserInterface f = new UserInterface("test");

    public void login(){
        f.login("checho",1);
    }

    public void logout(){
        f.logout();
    }

    public void deposit(){
        f.deposit(20);
    }

    public void withdraw(){
        f.withdraw(10);
    }
}
