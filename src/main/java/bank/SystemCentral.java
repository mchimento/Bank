/*
 * @author Mauricio Chimento
 */
package bank;

/**
 * The class SystemCentral is used to keep track of centralised data, i.e. data related to the whole system.
 */
public class SystemCentral {

	/** Maximum amount of logged users at the same time. */
	private static int MAX_USERS_AMOUNT = 3 ;
	
    /** The set of logged users. */
    public static HashTable users = new HashTable (MAX_USERS_AMOUNT);
    
}
