package bank;

public class ValidationBankModel {

   /*
    * done (Logout, login, Login)
    * done (Login, logout, Logout)
    * done (Logout, login, Login)
    * done (Login, deposit, Login)
    * done Random reset(true)
    */
   public static void trace1(){
       UserInterface f = new UserInterface("trace1");

       f.login("checho",1);
       f.logout();
       f.login("checho",1);
       f.deposit(20);
   }

    /*
     * done (Logout, login, Login)
     * done (Login, withdraw, Login)
     * done (Login, logout, Logout)
     * done (Logout, login, Login)
     * done (Login, deposit, Login)
     */
    public static void trace2(){
        UserInterface f = new UserInterface("trace2");

        f.login("checho",1);
        f.withdraw(10);
        f.logout();
        f.login("checho",1);
        f.deposit(20);
    }

}
