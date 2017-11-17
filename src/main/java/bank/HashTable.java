/*
 * @author Mauricio Chimento
 */
package bank;

/**
 * Open addressing Hashtable with linear probing as collision resolution.
 */
public class HashTable {
    
    /** Array used to store the entries in the hashtable. */
    public Object[] h;
	
    /** The size of the hashtable, i.e. amount of elements in the hashtable. */
    public int size; 
	
    /** The capacity of the hashtable, i.e. how many entries can be added to the hashtable. */
    public int capacity;
		
    /**
     * Instantiates a new hashtable.
     *
     * @param capacity the capacity of the hashtable
     */
    HashTable (int capacity) {
    }
	
    /**
     * Hash function to compute the appropriate index of an entry in the hashtable.
     *
     * @param val the index in the hashtable before using the hash function
     * @return the appropriate index in the hashtable
     */
    public int hash_function (int val) {
        return 0;
    }
	
    /**
     * Adds object <tt>u</tt>to the hashtable using linear probing as collision resolution.
     *
     * @param u the object to be added in the hashtable
     * @param key the index where it should be added (before using the hash function)
     */
    public void add (Object u, int key) {
    }

    /**
     * Deletes entry <tt>u</tt> from the hashtable.
     *
     * @param u the object to delete from the hashtable
     */
    // Removes an entry from the hashtable.
    public void delete (Object u, int key) {		
    }
    
    // 
    /**
     * Check if an entry is in the hashtable. If it is, then returns the index in the hashtable where it is.
     * Otherwise, it returns -1.
     *
     * @param u the object to search in the hashtable
     * @param key the index where u should be placed (before using the hash function)
     * @return the actual index where u is placed
     */
    public int contains (Object u, int key) {
       return 0;
    }
	
    /**
     * Gets the entry of the hashtable in the position idx.
     *
     * @param idx the index of the hashtable
     * @return the object placed in idx (if any)
     */ 
    public Object get (int idx) {
        return null;	
    }	
}
