/*
 * @author Mauricio Chimento
 */
package bank;

/**
 * This class is used to emulate a database.
 */
public final class DataBase {
	
    /** The capacity of the database, i.e. amount of entries on it. */
    private static int capacity = 3;

    /** Sample user Checho. */
    private static User Checho = new User("checho","Mauricio", "Chimento", 1);
    
    /** Sample user Wolfgang. */
    private static User Wolfgang = new User("supervisor","Wolfgang", "Ahrendt", 3);
    
    /** Sample user Gerardo. */
    private static User Gerardo = new User("cosupervisor", "Gerardo", "Schneider", 4); 
    
    /** Array representing the database. */
    static User[] db = {Checho, Wolfgang, Gerardo};
    
    /**
     * Searches for the user <tt>userName</tt> in the database. If the password is wrong, or the user
     * does not exist, then it returns null.
     * 
     * @param userName the user's name
     * @param password the user's password
     * @return the user (if found). <tt>null</tt> otherwise
     */
    public static User search(String userName, int password) {
        User u = null;
        int i = 0;

        while (i < capacity){			
            if (db[i].getUserName().equals(userName) && (db[i].getPassword() == password)) {
               u = db[i];
               break;
            } else {
                 i++;
              }
        }
        return u;
    }
}
