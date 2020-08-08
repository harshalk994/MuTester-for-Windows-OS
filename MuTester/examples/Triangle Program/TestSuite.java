/*
 * This is the test suite to unit test the Triangle program
 */

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;

import junit.framework.TestCase;

public class TestSuite extends TestCase {
	
	Triangle t;
	@Before
	public void init() {
		t = new Triangle();
	}

	public void test1() {
        assertEquals (t.classify(0,1301,1), "INVALID");
   }
   public void test2() {
        assertEquals (t.classify(1108,1,1), "INVALID");
   }
   public void test3() {
        assertEquals (t.classify(1,0,-665), "INVALID");
   }
   
   public void test4() {
        assertEquals (t.classify(1,1,0), "INVALID");
   }
   
   public void test5() {
        assertEquals (t.classify(582,582,582), "EQUILATERAL");
   }
   
   public void test6() {
        assertEquals (t.classify(1,1088,15), "INVALID");
   }
   public void test7() {
        assertEquals (t.classify(1,2,450), "INVALID");
   }
   public void test8() {
        assertEquals (t.classify(1663,1088,823), "SCALENE");
   }
   public void test9() {
        assertEquals (t.classify(1187,1146,1), "INVALID");
   }
   public void test10() {
        assertEquals (t.classify(1640,1640,1956), "ISOSCELES");
   }
   public void test11() {
        assertEquals (t.classify(784,784,1956), "INVALID");
   }
   public void test12() {
        assertEquals (t.classify(1,450,1), "INVALID");
   }
   public void test13() {
        assertEquals (t.classify(1146,1,1146), "ISOSCELES");
   }
   public void test14() {
        assertEquals (t.classify(1640,1956,1956), "ISOSCELES");
   }
   public void test15() {
        assertEquals (t.classify(-1,1,1), "INVALID");
   }
   public void test16() {
        assertEquals (t.classify(1,-1,1), "INVALID");
   }
   public void test17() {
        assertEquals (t.classify(1,2,3), "INVALID");
   }
   public void test18() {
        assertEquals (t.classify(2,3,1), "INVALID");
   }
   public void test19() {
        assertEquals (t.classify(3,1,2), "INVALID");
   }
   public void test20() {
        assertEquals (t.classify(1,1,2), "INVALID");
   }
   public void test21() {
        assertEquals (t.classify(1,2,1), "INVALID");
   }
   public void test22() {
        assertEquals (t.classify(2,1,1), "INVALID");
   }
   public void test23() {
        assertEquals (t.classify(1,1,1), "EQUILATERAL");
   }
   public void test24() {
        assertEquals (t.classify(0,1,1), "INVALID");
   }
   public void test25() {
        assertEquals (t.classify(1,0,1), "INVALID");
   }
   public void test26() {
        assertEquals (t.classify(1,2,-1), "INVALID");
   }
   public void test27() {
        assertEquals (t.classify(1,1,-1), "INVALID");
   }
   public void test28() {
        assertEquals (t.classify(0,0,0), "INVALID");
   }
   public void test29() {
        assertEquals (t.classify(3,2,5), "INVALID");
   }
   public void test30() {
        assertEquals (t.classify(5,9,2), "INVALID");
   }
   public void test31() {
        assertEquals (t.classify(7,4,3), "INVALID");
   }
   public void test32() {
        assertEquals (t.classify(3,8,3), "INVALID");
   }
   public void test33() {
        assertEquals (t.classify(7,3,3), "INVALID");
   }

}
