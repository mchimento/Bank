/*
 * @author Mauricio Chimento
 */
package bank;


/**
 * The Class representing the accounts of the bank.
 */
public class Account {
     
     /** The amount of money in the account. */
     private int balance;
     
     /** The id of the account. */
     private int id;
     
     /** Used to generate unique id numbers. */
     private static int count = 1;
     
     /** The extraction limit of the account. 0 means no limit on the extraction. */
     private int extractionLimit ;
     
     /**
      * Instantiates a new account.
      */
     Account() {
     }
     
     /**
      * Deposits <tt>money</tt> into the account.
      *
      * @param money amount of money to deposit into the account
      */
     public void deposit (int money) {
     }
      
     /**
      * Withdraws <tt>money</tt> from the account.
      *
      * @param money amount of money to withdraw from the account
      */
     public void withdraw(int money) {
     }
         
     /**
      * Transfers <tt>money</tt> to the account <tt>receiver</tt>.
      *
      * @param money amount of money to transfer from the current account
      * @param receiver account which will receive the money
      */
     public void transfer(int money, Account receiver) {         
     }

     /**
      * Gets the id of the account.
      *
      * @return the id of the account
      */
     public int getId() {
        return 0;
     }
     
     /**
      * Gets the balance of the account.
      *
      * @return the balance of the account
      */
     public int getBalance() {
        return 0;
     }
     
     /**
      * Gets the extraction limit of the account.
      *
      * @return the extraction limit of the account
      */
     public int getExtractionLimit() {
        return 0;
     }
     
     /**
      * Sets the extraction limit of the account.
      *
      * @param limit new extraction limit 
      */
     public void setExtractionLimit(int limit) {        
     }
     
}
