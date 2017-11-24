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

    @After
    public void tearDown() { hash = new HashTable(3); }

    @Test
    public void test_constructor(){
        assertEquals(hash.size, 0);
        assertEquals(hash.capacity, 3);
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
        assertEquals(hash.size, aux.size);
        assertEquals(hash.capacity, aux.capacity);
    }

    @Test
    public void test_contains_1(){
        hash.add(new Integer(42),0);

        int i = hash.contains(new Integer(42)) ;

        assertEquals(0,i);
    }

    @Test
    public void test_contains_2(){
        int i = hash.contains(new Integer(42)) ;

        assertEquals(-1,i);
    }

    @Test
    public void test_delete_1(){
        hash.add(new Integer(42),0);
        hash.add(new Integer(3),1);

        HashTable aux = new HashTable(3) ;
        aux.add(new Integer(3),1);

        Object res = hash.delete(0);

        assertNull(hash.get(0));
        assertEquals(res,new Integer(42));
        assertArrayEquals(aux.h, hash.h);
    }

    @Test
    public void test_delete_2(){
        assertNull(hash.delete(0));
    }

    @Test
    public void test_delete_3(){
        assertNull(hash.delete(4));
    }


    @Test
    public void test_get(){
        hash.add(new Integer(42),0);

        assertEquals(hash.get(0),new Integer(42));
    }
}
