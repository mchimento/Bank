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

     /** The id of the account. */
     private /*@ spec_public @*/ int id;

     /** Used to generate unique id numbers. */
     private /*@ spec_public @*/ static int count = 1;
     
     /*@ public invariant amountExtracted >= 0 ; @*/
     
     /** Amount of money extracted during the week. */
     private /*@ spec_public @*/ int amountExtracted ;
     
     /**
      * Instantiates a new account.
      */
   /*@ public normal_behaviour
     @ ensures balance == 0 && id == \old(count) && amountExtracted == 0 && count == \old(count) + 1;
     @ assignable \everything ;
     @ */
     Account() {
         balance = 0;
         id = count ;
         count = count + 1 ;
         amountExtracted = 0 ;
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
     @
     @ also
     @
     @ public normal_behaviour
     @ requires money <= 0 ;
     @ assignable \nothing ;
     @ */     
     public void deposit (int money) {
         if (money > 0)
            balance = balance + money ;
     }
      
     /**
      * Withdraws <tt>money</tt> from the account.
      *
      * @param money amount of money to withdraw from the account
      */
   /*@ public normal_behaviour
     @ requires money > 0 && balance - money >= 0 ;
     @ ensures balance == \old(balance) - money && amountExtracted == \old(amountExtracted) + money;
     @ assignable balance ;
     @
     @ also
     @
     @ public normal_behaviour
     @ requires (money > 0 && balance - money < 0) || money < 0 ;
     @ assignable \nothing ;
     @ */
     public void withdraw(int money) {
         if (money > 0 && balance - money >= 0){
             balance = balance - money ;
             amountExtracted = amountExtracted + money;
         }
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
         return id;
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
         return balance;
     }
     
     /**
      * Gets the amount of money extracted during the week.
      *
      * @return the extraction limit of the account
      */
   /*@ public normal_behaviour
     @ ensures \result == amountExtracted ;
     @ */     
     public /*@ pure @*/ int getAmountExtracted() {
         return amountExtracted;
     }
     
     /**
      * Sets the amount of money extracted during the week.
      *
      * @param limit new extraction limit 
      */
   /*@ public normal_behaviour
     @ requires limit >= 0 ;
     @ ensures amountExtracted == limit ;
     @ assignable amountExtracted ;
     @ */
     public void setAmountExtracted(int limit) {
         amountExtracted = limit ;
     }

}
