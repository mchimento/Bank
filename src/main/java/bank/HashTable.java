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

    /*@ public invariant h != null ; @*/

    /** Array used to store the entries in the hashtable. */
    public /*@ nullable @*/ Object[] h;
	
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
    @ ensures this.capacity == capacity && size == 0 && h != null ;
    @ assignable \everything ;
    @ */
    HashTable (int capacity) {
        this.capacity = capacity ;
        size = 0;
        h = new Object[capacity];
    }
	
    /**
     * Hash function to compute the appropriate index of an entry in the hashtable.
     *
     * @param val the index in the hashtable before using the hash function
     * @return the appropriate index in the hashtable
     */
  /*@ public normal_behaviour
    @ requires val >= 0 ;
    @ ensures \result == val % capacity;
    @
    @ also
    @
    @ public normal_behaviour
    @ requires val < 0 ;
    @ ensures \result == (val * -1) % capacity;
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
        if (size < capacity) {
            int i = hash_function(key);

            if (h[i] == null) {
                h[i] = u;
                size++;
                return;
            }
            else {
                int j = 0;
            //TODO: replace < with <= in the while to introduce a bug
            //spotted by deductive verification
            /*@ loop_invariant j >= 0 && j <= capacity && i >= 0 && i < capacity;
		      @ assignable j,i;
		      @ decreases capacity - j;
		      @*/
                while (h[i] != null && j < capacity) {
                    if (i == capacity-1)
                        i = 0;
                    else {
                        i++;
                    }
                    j++;
                }
                h[i] = u;
                size++;
                return;
            }
        } else {
            return;
        }
    }

    /**
     * Deletes entry at <tt>key</tt> from the hashtable.
     *
     * @param key removes the key (and its corresponding object) from the hashtable
     * @return removed object
     */
  /*@ public normal_behaviour
    @ requires key >= 0 ;
    @ requires h[hash_function(key)] != null ;
    @ requires size > 0 ;
    @ ensures \result == \old(h[hash_function(key)]) ;
    @ ensures h[hash_function(key)] == null && size == \old(size) - 1;
    @ ensures (\forall int j; j >= 0 && j < capacity && j != hash_function(key) ; h[j] == \old(h[j])) ;
    @ assignable size,h[*] ;
    @
    @ also
    @
    @ public normal_behaviour
    @ requires key >= 0 ;
    @ requires h[hash_function(key)] == null ;
    @ ensures \result == null ;
    @ assignable \nothing ;
    @
    @ also
    @
    @ public normal_behaviour
    @ requires key < 0 ;
    @ ensures \result == null ;
    @ assignable \nothing ;
    @ */      
    public /*@ nullable @*/ Object delete (int key) {
        if (key >= 0) {
            //TODO: remove the line below and replace i by key, to introduce a bug
            //spotted by deductive verification
            int i = hash_function(key);

            if (h[i] == null)
                return null;
            else {
                Object ret = h[i] ;
                h[i] = null ;
                size = size - 1;
                return ret;
            }
        } else {
            return null;
        }
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
    @ requires u != null ;
    @ ensures \result >= -1 && \result < capacity && (u.equals(h[\result]) || \result == -1) ;
    @ */
    public /*@ pure @*/ int contains (Object u) {
        int i = 0 ;

        //TODO: Missing information to prove loop invariant. Generate a test case for that
        // scenario and continue with the development process.
      /*@ loop_invariant i >= 0 && i <= capacity ;
	    @ assignable i;
	    @ decreases capacity - i;
        @*/
        while (i < capacity) {
            if (h[i] != null && u.equals(h[i]))
                return i ;
            i++;
        }

        return -1;
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
        return h[idx];
    }	
}
