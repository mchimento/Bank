/*
 * @author Mauricio Chimento
 */
package bank;

import org.junit.*;
import static org.junit.Assert.*;


/**
 * Unit tests for the class HashTable.
 */
public class HashTableTest {

    HashTable hash ;

    @Before
    public void setUp(){
        hash = new HashTable(3);
    }

    @Test
    public void test_constructor(){
        assertTrue(hash.size == 0);
        assertTrue(hash.capacity == 3);
        assertArrayEquals(hash.h,new Object[hash.capacity]);
    }

    @Test
    public void test_hashFunction(){
        assertTrue(hash.hash_function(3) >= 0);
        assertTrue(hash.hash_function(3) < hash.capacity);
    }

    @Test
    public void test_add_1(){
        int idx = hash.hash_function(3) ;
        hash.add(new Integer(42),idx);

        assertEquals(hash.h[idx],new Integer(42));
    }

    @Test
    public void test_add_2(){
        hash.add(new Integer(42),0);
        hash.add(new Integer(3),1);
        hash.add(new Integer(38),2);

        HashTable aux = new HashTable(3) ;
        aux.add(new Integer(42),0);
        aux.add(new Integer(3),1);
        aux.add(new Integer(38),2);
        aux.add(new Integer(55), aux.hash_function(42));

        assertArrayEquals(hash.h,aux.h);
        assertTrue(hash.size == aux.size);
        assertTrue(hash.capacity == aux.capacity);
    }

    @Test
    public void test_get(){
        hash.add(new Integer(42),0);

        assertEquals(hash.get(0),new Integer(42));
    }
}
