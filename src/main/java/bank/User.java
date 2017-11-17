/*
 * @author Mauricio Chimento
 */
package bank;

/**
 * The class representing the users of the bank.
 */
public class User {
    
    /** The password of the user. */
    private int password;
    
    /** The user name. */
    private String userName;
    
    /** The actual name of the user. */
    private String name;
    
    /** The surname of the user. */
    private String surname;
    
    /** The account of the user. */
    private Account account;
    
    /** The category of the user. */
    private Category.Type category ;

    /**
     * Instantiates a new user.
     *
     * @param userName the user name
     * @param name the name of the user
     * @param surname the surname of the user
     * @param id the password
     */
    User (String userName, String name, String surname, int id) {}
    
    /**
     * Sets the category of the user.
     *
     * @param c the new category
     */
    public void setCategory(Category.Type c){
    	
    }
    
    /**
     * Gets the category of the user.
     *
     * @return the category of the user
     */
    public Category.Type getCategory(){
    	return null;
    }

    /**
     * Sets the password.
     *
     * @param pass the password for the user
     */
    public void setPassword (int pass) {

    }
    
    /**
     * Gets the password.
     *
     * @return the password of the user
     */
    public int getPassword () {
        return 0;
    }

    /**
     * Gets the user name.
     *
     * @return the user name
     */
    public String getUserName (){
        return "";
    }
    
    /**
     * Sets the user name.
     *
     * @param uname the user name
     */
    public void setUserName (String uname) {

    }

    /**
     * Gets the name of the user.
     *
     * @return the name of the user
     */
    public String getName (){
        return "";
    }

    /**
     * Sets the (actual) name of the user.
     *
     * @param name the name for the user
     */
    public void setName (String name) {

    }
    
    /**
     * Gets the surname of the user.
     *
     * @return the surname for the user
     */
    public String getSurname () {
        return "";
    }

    /**
     * Sets the surname of the user.
     *
     * @param surname the surname for the user
     */
    public void setSurname (String surname) {

    }
    
    /**
     * Gets the account of the user.
     *
     * @return the account of the user
     */
    public Account getAccount() {
         return null;
    }
    
    /**
     * Sets the account of the user.
     *
     * @param acc the account for the user
     */
    public void setAccount (Account acc) {

    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString(){
        return "";
    }
}
