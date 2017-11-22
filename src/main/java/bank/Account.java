/*
 * @author Mauricio Chimento
 */
package bank;


/**
 * The Class representing the accounts of the bank.
 */
public class Account {
    
	/*@ public invariant balance >= 0 ; @*/
	
     /** The amount of money in the account. */
     private /*@ spec_public @*/ int balance;
     
     /*@ public invariant count >= 0 ; @*/
     
     /** The id of the account. */
     private /*@ spec_public @*/ int id;
     
     /*@ public invariant count >= 1 ; @*/
     
     /** Used to generate unique id numbers. */
     private /*@ spec_public @*/ static int count = 1;
     
     /*@ public invariant extractionLimit >= 0 ; @*/
     
     /** The extraction limit of the account. 0 means no limit on the extraction. */
     private /*@ spec_public @*/ int extractionLimit ;
     
     /**
      * Instantiates a new account.
      */
   /*@ public normal_behaviour
     @ ensures balance == 0 && id == \old(count) && extractionLimit == 0 && count == \old(count) + 1;
     @ assignable \everything ;
     @ */
     Account() {
     }
     
     /**
      * Deposits <tt>money</tt> into the account.
      *
      * @param money amount of money to deposit into the account
      */
   /*@ public normal_behaviour
     @ requires money > 0 ;
     @ ensures balance == \old(balance) + money ;
     @ assignable balance ;
     @ */     
     public void deposit (int money) {
     }
      
     /**
      * Withdraws <tt>money</tt> from the account.
      *
      * @param money amount of money to withdraw from the account
      */
   /*@ public normal_behaviour
     @ requires money > 0 && balance - money >= 0 ;
     @ ensures receiver.getBalance() == \old(receiver.getBalance()) + money ;
     @ ensures balance == \old(balance) - money ;
     @ assignable balance ;
     @
     @ also
     @
     @ public normal_behaviour
     @ requires (money > 0 && balance - money < 0) || money < 0 ;
     @ assignable \nothing ;
     @ */
     public void withdraw(int money) {
     }
         
     /**
      * Transfers <tt>money</tt> to the account <tt>receiver</tt>.
      *
      * @param money amount of money to transfer from the current account
      * @param receiver account which will receive the money
      */
   /*@ public normal_behaviour
     @ requires money > 0 && receiver.getBalance() - money >= 0 ;
     @ ensures receiver.getBalance() == \old(receiver.getBalance()) - money ;
     @ assignable balance ;
     @
     @ also
     @ 
     @ public normal_behaviour
     @ requires (money > 0 && receiver.getBalance() - money < 0) || money < 0 ;
     @ assignable \nothing ;
     @ */
     public void transfer(int money, Account receiver) {         
     }

     /**
      * Gets the id of the account.
      *
      * @return the id of the account
      */   
   /*@ public normal_behaviour
     @ ensures \result == id ;          
     @ */  
     public /*@ pure @*/ int getId() {
        return 0;
     }
     
     /**
      * Gets the balance of the account.
      *
      * @return the balance of the account
      */
   /*@ public normal_behaviour
     @ ensures \result == balance ;          
     @ */
     public /*@ pure @*/ int getBalance() {
        return 0;
     }
     
     /**
      * Gets the extraction limit of the account.
      *
      * @return the extraction limit of the account
      */
   /*@ public normal_behaviour
     @ ensures \result == extractionLimit ;          
     @ */     
     public /*@ pure @*/ int getExtractionLimit() {
        return 0;
     }
     
     /**
      * Sets the extraction limit of the account.
      *
      * @param limit new extraction limit 
      */
   /*@ public normal_behaviour
     @ requires limit >= 0 ;
     @ ensures extractionLimit == limit ;
     @ assignable extractionLimit ;          
     @ */
     public void setExtractionLimit(int limit) {        
     }
     
}
