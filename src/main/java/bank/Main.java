/*
 * @author Mauricio Chimento
 */
package bank;

import java.util.Scanner;

/**
 * The Class Main.
 */
public class Main {

   /**
    * The main method.
    *
    * @param args the arguments
    * @throws Exception the exception
    */
   public static void main(String[] args) throws Exception {
       UserInterface f = new UserInterface("Bank");
       String amount; int aux;

       Scanner in = new Scanner (System.in);
       int exit = 0;

       System.out.println("Welcome to the ATM.");

       while (exit == 0) {
           System.out.println("\nChoose an action to perform:");

           String inputLine = in.next();
           if (f.getUser() == null){
               switch (inputLine) {
                   case "login":
                       System.out.print("Enter your username: ");
                       String userName = in.next();

                       System.out.print("\nEnter your password: ");
                       String password = in.next();

                       f.login(userName, Integer.parseInt(password));
                       break;

                   case "quit":
                       System.out.println("\nLeaving the program.");
                       exit = 1;
                       break;

                   default:
                       System.out.println("Wrong action.");
                       break;
               }
           } else {
               switch (inputLine) {
                   case "deposit":
                       System.out.print("Enter the amount of money to deposit: ");
                       amount = in.next();
                       aux = Integer.parseInt(amount);
                       f.deposit(aux);
                       break;
                   case "withdraw":
                       System.out.print("Enter the amount of money to deposit: ");
                       amount = in.next();
                       aux = Integer.parseInt(amount);
                       f.deposit(aux);
                       break;
                   case "balance":
                       System.out.printf("\nYour balance is %d.\n", f.getUser().getAccount().getBalance());
                       break;
                   case "logout":
                       f.logout();
                       break;
                   default: System.out.println("Wrong action.");
                       break;
               }
           }
       }
       in.close();
   }
}
