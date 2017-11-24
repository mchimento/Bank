/*
 * @author Mauricio Chimento
 */
package bank;

/**
 * Open addressing Hashtable with linear probing as collision resolution.
 */
public class HashTable {
    
	/*@ public invariant \typeof(h) == \type(Object[]) ; @*/
	
	/*@ public invariant h.length == capacity ; @*/
	
    /** Array used to store the entries in the hashtable. */
    public /*@ non_null @*/ Object[] h;
	
    /*@ public invariant size >= 0 && size <= capacity ; @*/
    
    /** The size of the hashtable, i.e. amount of elements in the hashtable. */
    public int size; 
	
    /*@ public invariant capacity >= 1 ; @*/
    
    /** The capacity of the hashtable, i.e. how many entries can be added to the hashtable. */
    public int capacity;
		
    /**
     * Instantiates a new hashtable.
     *
     * @param capacity the capacity of the hashtable
     */
  /*@ public normal_behaviour
    @ requires capacity >= 1 ;
    @ ensures this.capacity == capacity && size == 0 ;
    @ assignable \everything ;
    @ */
    HashTable (int capacity) {
    }
	
    /**
     * Hash function to compute the appropriate index of an entry in the hashtable.
     *
     * @param val the index in the hashtable before using the hash function
     * @return the appropriate index in the hashtable
     */
  /*@ public normal_behaviour
    @ ensures \result >= 0 && \result < capacity ;
    @ */    
    public /*@ pure @*/ int hash_function (int val) {
        int result = 0;

        if (val >= 0)
           result = val % capacity;
        else {result = (val * -1) % capacity;}

        return result;
    }
	
    /**
     * Adds object <tt>u</tt>to the hashtable using linear probing as collision resolution.
     *
     * @param u the object to be added in the hashtable
     * @param key the index where it should be added (before using the hash function)
     */
  /*@ public normal_behaviour
    @ requires size < capacity ;
    @ ensures (\exists int i; i >= 0 && i < capacity; h[i] == u) ;
    @ assignable size,h[*] ;
    @
    @ also
    @
    @ public normal_behaviour
    @ requires size >= capacity ;
    @ assignable \nothing ;
    @ */    
    public void add (Object u, int key) {
    }

    /**
     * Deletes entry at <tt>key</tt> from the hashtable.
     *
     * @param key removes the key (and its corresponding object) from the hashtable
     * @return removed object
     */
  /*@ public normal_behaviour
    @ requires key >= 0 && key < capacity ;
    @ requires h[hash_function(key)] != null ;
    @ ensures h[hash_function(key)] == null ;
    @ ensures \result == h[hash_function(key)] ;
    @ ensures (\forall int j; j >= 0 && j < capacity && j != hash_function(key) ; h[j] == \old(h)[j]) ;
    @ assignable size,h[*] ;
    @
    @ also
    @
    @ public normal_behaviour
    @ requires key >= 0 && key < capacity ;
    @ requires h[hash_function(key)] == null ;
    @ ensures \result == null ;
    @ assignable \nothing ;
    @
    @ also
    @
    @ public normal_behaviour
    @ requires !(key >= 0 && key < capacity) ;
    @ ensures \result == null ;
    @ assignable \nothing ;
    @ */      
    public Object delete (int key) {
        return null ;
    }
    
    // 
    /**
     * Check if an entry is in the hashtable. If it is, then returns the index in the hashtable where it is.
     * Otherwise, it returns -1.
     *
     * @param u the object to search in the hashtable
     * @return the actual index where u is placed
     */
  /*@ public normal_behaviour
    @ requires u != null && (\exists int i; i >= 0 && i < capacity; h[i] == u) ;
    @ ensures \result >= 0 && \result < capacity ;
    @
    @ also 
    @ 
    @ public normal_behaviour
    @ requires u != null && !(\exists int i; i >= 0 && i < capacity; h[i] == u) ;
    @ ensures \result == -1 ;
    @ */      
    public /*@ pure @*/ int contains (Object u) {
       return 0;
    }
	
    /**
     * Gets the entry of the hashtable in the position idx.
     *
     * @param idx the index of the hashtable
     * @return the object placed in idx (if any)
     */ 
  /*@ public normal_behaviour
    @ requires idx >= 0 && idx < capacity ; 
    @ ensures \result == h[idx] ;
    @ */      
    public /*@ pure @*/ Object get (int idx) {
        return null;	
    }	
}
