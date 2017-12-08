/*
 * @author Mauricio Chimento
 */
package bank;

/**
 * The class representing the interface offered to the users in order to interact with their accounts.
 */
public class UserInterface {
		
    /** The name of the interface. */
    private String name;
    
    /** The user associated to the instance of the interface. */
    private User u;

    /**
     * Gets the user associated to the interface.
     *
     * @return the user associated to the interface
     */	
    public User getUser() {
      return null; 
    }

    /**
     * Instantiates a new user interface.
     *
     * @param str the name of the interface
     */	
    UserInterface(String str){
    }	
	
    /**
     * Logs a user into the system, and associates the instance of the interface to him/her.
     *
     * @param userName the user name
     * @param password the password
     */	
    public void login (String userName, int password) {
    }

    /**
     * Logs out a user from the system.
     */	
    public void logout () {
    }

    /**
     * Deposits the money in the user's account.
     *
     * @param money the amount of money to deposit in the user's account
     */	
    public void deposit(int money){
    }
	
    /**
     * Withdraws the money from the user's account.
     *
     * @param money the amount of money to withdraw from the user's account
     */	
    public void withdraw(int money){
    }
}
