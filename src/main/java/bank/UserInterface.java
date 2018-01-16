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
      return u;
    }

    /**
     * Instantiates a new user interface.
     *
     * @param str the name of the interface
     */
    UserInterface(String str){
        name = str;
        u = null;
    }	
	
    /**
     * Logs a user into the system, and associates the instance of the interface to him/her.
     *
     * @param userName the user name
     * @param password the password
     */
    public void login (String userName, int password) {
        if (u == null) {
            //Gets the user data from the database
            User user = DataBase.search(userName, password);

            if (user != null) {
                if ((SystemCentral.users.contains(user) < 0
                        && SystemCentral.users.size < SystemCentral.users.capacity)) {
                    SystemCentral.users.add(user, password);
                    u = user;
                    System.out.printf("Welcome " + u.getName() + " " + u.getSurname() + "!\n");
                } else {
                    System.out.printf("Login failure " + u.getName() + " " + u.getSurname() + ".\n");
                }
            } else {
                System.out.printf("Wrong user name or password.\n");
            }
        }
    }

    /**
     * Logs out a user from the system.
     */
    public void logout () {
        if (u != null) {
            SystemCentral.users.delete(SystemCentral.users.contains(u));
            u = null;
            System.out.printf("Have a good day.\n");
        }
    }

    /**
     * Deposits the money in the user's account.
     *
     * @param money the amount of money to deposit in the user's account
     */
    public void deposit(int money){
        if (u != null && money > 0){
            u.getAccount().deposit(money);
        }
    }
	
    /**
     * Withdraws the money from the user's account.
     *
     * @param money the amount of money to withdraw from the user's account
     */
    public void withdraw(int money){
        if (u != null && money > 0){
            if (u.getAccount().getBalance() - money >= 0) {
                if (categoryLimit(money))
                    u.getAccount().withdraw(money);
                else {
                    System.out.printf("\nAmount requested exceeds the weekly limit of the user.");
                }
            } else {
                System.out.printf("\nNot enough money into the account to perform the operation.");
            }
        }
    }

    public boolean categoryLimit(int money){
        boolean ret = false ;

        switch (u.getCategory()){
            case Bronze:
                ret = u.getAccount().getAmountExtracted() + money <= 5000;
                break;
            case Silver:
                ret = u.getAccount().getAmountExtracted() + money <= 20000;
                break;
            case Gold:
                ret = true;
                break;
            default:
                break;
        }
        return ret;
    }
}
