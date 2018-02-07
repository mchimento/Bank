/** This is a test driver generated by KeY 2.6.3 (internal: 19f0b8c2a4fe689cd76be6cd1753b36e2e825a89) (www.key-project.org). 
 * Possible use cases:
 *  Use Case 1. Using JUnit 4:
 *        javac -cp .:PATH_TO_JUNIT4_JAR *.java
 *        java  -cp .:PATH_TO_JUNIT4_JAR:PATH_TO_HAMCREST_JAR org.junit.runner.JUnitCore TestGeneric0_delete
 *  Use Case 2. Use JML runtime checker: 
 *      Compile this file and and execute the main method with a JML runtime checker. On linux you can use the built-in scripts:
 *        ./compileWithOpenJML.sh
 *        ./executeWithOpenJML.sh TestGeneric0_delete
 *  Use Case 3. Use simply a program debugger to follow and understand the execution of the program.
 * @author Christoph Gladisch
 * @author Mihai Herda
 */
package bank;

import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

 public class TestGeneric0_delete extends junit.framework.TestCase {

 public static junit.framework.Test suite() {    return new junit.framework.JUnit4TestAdapter(TestGeneric0_delete.class);
 } 

 public TestGeneric0_delete(){}


 public static void  main (java.lang.String[]  arg) {
   TestGeneric0_delete testSuiteObject;
   testSuiteObject=new TestGeneric0_delete ();

   testSuiteObject.testcode0();
 }

  //Test Case for NodeNr: 1475
@org.junit.Test
 public void  testcode0(){
   //Test preamble: creating objects and intializing test data
   java.lang.Object[] _o2 = new java.lang.Object[3];
   java.lang.Object[] _pre_o2 = new java.lang.Object[3];
   java.lang.ArrayIndexOutOfBoundsException _o4 = RFL.newjava_lang_ArrayIndexOutOfBoundsException();
   java.lang.ArrayIndexOutOfBoundsException _pre_o4 = RFL.newjava_lang_ArrayIndexOutOfBoundsException();
   bank.HashTable _o1 = RFL.newbank_HashTable();
   bank.HashTable _pre_o1 = RFL.newbank_HashTable();
   int hash_function_sk_4 = (int)0;
   int quotient_1 = (int)1;
   boolean measuredByEmpty = (boolean)true;
   /*@ nullable */ java.lang.ArrayIndexOutOfBoundsException a_7 = (java.lang.ArrayIndexOutOfBoundsException)_o4;
   /*@ nullable */ java.lang.ArrayIndexOutOfBoundsException _prea_7 = (java.lang.ArrayIndexOutOfBoundsException)_pre_o4;
   /*@ nullable */ bank.HashTable self = (bank.HashTable)_o1;
   /*@ nullable */ bank.HashTable _preself = (bank.HashTable)_pre_o1;
   int key = (int)3;
    _o2[0] = _o1;
    _pre_o2[0] = _pre_o1;
    _o2[1] = _o1;
    _pre_o2[1] = _pre_o1;
    _o2[2] = _o1;
    _pre_o2[2] = _pre_o1;
   RFL._set_int(bank.HashTable.class, _o1, "capacity", (int)3);
   RFL._set_int(bank.HashTable.class, _pre_o1, "capacity", (int)3);
   RFL._set_java_lang_Object_ARRAY_(bank.HashTable.class, _o1, "h", (java.lang.Object[])_o2);
   RFL._set_java_lang_Object_ARRAY_(bank.HashTable.class, _pre_o1, "h", (java.lang.Object[])_pre_o2);
   RFL._set_int(bank.HashTable.class, _o1, "size", (int)2);
   RFL._set_int(bank.HashTable.class, _pre_o1, "size", (int)2);

   Map<Object,Object> old = new HashMap<Object,Object>();
   old.put(_pre_o1,_o1);
   old.put(_pre_o2,_o2);
   old.put(_pre_o4,_o4);

   Set<Boolean> allBools= new HashSet<Boolean>();
   allBools.add(true);
   allBools.add(false);

   Set<Integer> allInts= new HashSet<Integer>();
   allInts.add(-4);
   allInts.add(-3);
   allInts.add(-2);
   allInts.add(-1);
   allInts.add(0);
   allInts.add(1);
   allInts.add(2);
   allInts.add(3);

   Set<Object> allObjects= new HashSet<Object>();
   allObjects.add(_o2);
   allObjects.add(_o4);
   allObjects.add(_o1);



   //Other variables

   /*@ nullable */ java.lang.Throwable exc = null;
   /*@ nullable */ java.lang.Throwable _preexc = null;
   /*@ nullable */ java.lang.Object result = null;
   /*@ nullable */ java.lang.Object _preresult = null;
   //Calling the method under test   
      
int _key = key;
{
  exc=null;try {
    result=self.delete(_key);
  }   catch (java.lang.Throwable e) {
    exc=e;
  }
}
   //calling the test oracle
   assertTrue(testOracle( key, 0, exc, _preexc, result, _preresult, self, _preself, allBools, allInts, allObjects, old));
 }



   public boolean testOracle(int key,int _prekey,java.lang.Throwable exc,java.lang.Throwable _preexc,java.lang.Object result,java.lang.Object _preresult,bank.HashTable self,bank.HashTable _preself,Set<Boolean> allBools,Set<Integer> allInts,Set<java.lang.Object> allObjects,Map<Object,Object> old){
      return (((result == old.get(RFL._get_java_lang_Object_ARRAY_(bank.HashTable.class, _preself, "h")[self.hash_function( key)])) && (((RFL._get_java_lang_Object_ARRAY_(bank.HashTable.class, self, "h")[self.hash_function( key)] == null) && (RFL._get_int(bank.HashTable.class, self, "size") == (RFL._get_int(bank.HashTable.class, _preself, "size") - 1))) && (sub1( key, _prekey, exc, _preexc, result, _preresult, self, _preself, allBools, allInts, allObjects, old) && inv_javalangObject( self, key, _prekey, exc, _preexc, result, _preresult, self, _preself, allBools, allInts, allObjects, old)))) && (exc == null));
   }

   public boolean sub1(int key,int _prekey,java.lang.Throwable exc,java.lang.Throwable _preexc,java.lang.Object result,java.lang.Object _preresult,bank.HashTable self,bank.HashTable _preself,Set<Boolean> allBools,Set<Integer> allInts,Set<java.lang.Object> allObjects,Map<Object,Object> old){
      
   for(int j : allInts){
      if(!(!(((j >= 0) && (j < RFL._get_int(bank.HashTable.class, self, "capacity"))) && !(j == self.hash_function( key))) || (RFL._get_java_lang_Object_ARRAY_(bank.HashTable.class, self, "h")[j] == old.get(RFL._get_java_lang_Object_ARRAY_(bank.HashTable.class, _preself, "h")[j])))){
         return false;
      }
   }
   return true;
   }

   public boolean inv_javalangObject(java.lang.Object o,int key,int _prekey,java.lang.Throwable exc,java.lang.Throwable _preexc,java.lang.Object result,java.lang.Object _preresult,bank.HashTable self,bank.HashTable _preself,Set<Boolean> allBools,Set<Integer> allInts,Set<java.lang.Object> allObjects,Map<Object,Object> old){
      return true;
   }
}