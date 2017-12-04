/*
 * @author Mauricio Chimento
 */
package bank;

/**
 * The class representing the users of the bank.
 */
public class User {
    
    /** The password of the user. */
    private /*@ spec_public @*/ int password;
       
    /** The user name. */
    private /*@ spec_public non_null @*/ String userName;
        
    /** The actual name of the user. */
    private /*@ spec_public non_null @*/ String name;
    
    /** The surname of the user. */
    private /*@ spec_public non_null @*/ String surname;
    
    /** The account of the user. */
    private /*@ spec_public nullable @*/ Account account;
    
    /** The category of the user. */
    private /*@ spec_public @*/ Category.Type category ;
    
    /**
     * Instantiates a new user. New users have the lowest category.
     *
     * @param userName the user name
     * @param name the name of the user
     * @param surname the surname of the user
     * @param id the password
     */
  /*@ public normal_behaviour
    @ ensures this.userName == userName && this.name == name && this.surname == surname ; 
    @ ensures account == null && password == id && category == Category.Type.Bronze ;
    @ assignable \everything ;
    @ */      
    User (String userName, String name, String surname, int id) {
        this.userName = userName;
        this.name = name ;
        this.surname = surname ;
        password = id ;
        category = Category.Type.Bronze ;
    }
    
    /**
     * Sets the category of the user.
     *
     * @param c the new category
     */
  /*@ public normal_behaviour
    @ ensures category == c ;
    @ assignable category ;          
    @ */
    public void setCategory(Category.Type c){
    	category = c ;
    }
    
    /**
     * Gets the category of the user.
     *
     * @return the category of the user
     */
  /*@ public normal_behaviour
    @ ensures \result == category ;          
    @ */      
    public /*@ pure @*/ Category.Type getCategory(){
        return category;
    }

    /**
     * Sets the password.
     *
     * @param pass the password for the user
     */
  /*@ public normal_behaviour
    @ ensures password == pass ;
    @ assignable password ;          
    @ */    
    public void setPassword (int pass) {
        password = pass ;
    }
    
    /**
     * Gets the password.
     *
     * @return the password of the user
     */
  /*@ public normal_behaviour
    @ ensures \result == password ;          
    @ */      
    public /*@ pure @*/ int getPassword () {
        return password;
    }

    /**
     * Gets the user name.
     *
     * @return the user name
     */
  /*@ public normal_behaviour
    @ ensures \result == userName ;          
    @ */          
    public /*@ pure @*/ String getUserName (){
        return userName;
    }
    
    /**
     * Sets the user name.
     *
     * @param uname the user name
     */
  /*@ public normal_behaviour
    @ ensures userName == uname ;
    @ assignable userName ;         
    @ */
    public void setUserName (String uname) {
        userName = uname ;
    }

    /**
     * Gets the name of the user.
     *
     * @return the name of the user
     */
  /*@ public normal_behaviour
    @ ensures \result == name ;          
    @ */          
    public /*@ pure @*/ String getName (){
        return name ;
    }

    /**
     * Sets the (actual) name of the user.
     *
     * @param name the name for the user
     */
  /*@ public normal_behaviour
    @ ensures this.name == name ;
    @ assignable name ;          
    @ */    
    public void setName (String name) {
        this.name = name ;
    }
    
    /**
     * Gets the surname of the user.
     *
     * @return the surname for the user
     */
  /*@ public normal_behaviour
    @ ensures \result == surname ;          
    @ */          
    public String /*@ pure @*/ getSurname () {
        return surname;
    }

    /**
     * Sets the surname of the user.
     *
     * @param surname the surname for the user
     */
  /*@ public normal_behaviour
    @ ensures this.surname == surname ;
    @ assignable surname ;          
    @ */
    public void setSurname (String surname) {
        this.surname = surname ;
    }
    
    /**
     * Gets the account of the user.
     *
     * @return the account of the user
     */
  /*@ public normal_behaviour
    @ ensures \result == account ;          
    @ */      
    public Account /*@ pure @*/ getAccount() {
        return account;
    }
    
    /**
     * Sets the account of the user.
     *
     * @param acc the account for the user
     */
  /*@ public normal_behaviour
    @ ensures account == acc ;
    @ assignable account ;          
    @ */   
    public void setAccount (Account acc) {
        account = acc ;
    }
}
