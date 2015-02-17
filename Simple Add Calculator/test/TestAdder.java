import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestAdder {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1BnPlus1BnEquals2Bn() throws Exception {
		// Setup (3rd)
		Adder adder = new Adder();
		
		// Execution (2nd)
		int result = adder.add(1000000000, 1000000000);
		
		// Verification (1st)
		assertEquals(2000000000, result);
		
		// Teardown (4th)
	}

	@Test
	public void testNeg1BnPlusNeg1BnEqualsNeg2Bn() throws Exception {
		// Setup (3rd)
		Adder adder = new Adder();
		
		// Execution (2nd)
		int result = adder.add(-1000000000, -1000000000);
		
		// Verification (1st)
		assertEquals(-2000000000, result);
		
		// Teardown (4th)
	}

	@Test
	public void testNeg1Bn1PlusFortyTwoThrowsException() {
		// Setup (3rd)
		Adder adder = new Adder();
		
		// Execution (2nd)
		try {
			int result = adder.add(-1000000001, 42);
		
			// Verification (1st)
			fail("Exception should have been thrown");
		}
		catch (Exception e) {
			// Exception was thrown as expected
		}
		
		// Teardown (4th)
	}

	@Test
	public void testFiftyThreePlusNeg1Bn1PlusThrowsException() {
		// Setup (3rd)
		Adder adder = new Adder();
		
		// Execution (2nd)
		try {
			int result = adder.add(53, -1000000001);
		
			// Verification (1st)
			fail("Exception should have been thrown");
		}
		catch (Exception e) {
			// Exception was thrown as expected
		}
		
		// Teardown (4th)
	}

	@Test
	public void test1Bn1PlusEightThrowsException() {
		// Setup (3rd)
		Adder adder = new Adder();
		
		// Execution (2nd)
		try {
			int result = adder.add(1000000001, 8);
		
			// Verification (1st)
			fail("Exception should have been thrown");
		}
		catch (Exception e) {
			// Exception was thrown as expected
		}
		
		// Teardown (4th)
	}

	@Test
	public void testThirteenPlusNeg1Bn1PlusThrowsException() {
		// Setup (3rd)
		Adder adder = new Adder();
		
		// Execution (2nd)
		try {
			int result = adder.add(13, 1000000001);
		
			// Verification (1st)
			fail("Exception should have been thrown");
		}
		catch (Exception e) {
			// Exception was thrown as expected
		}
		
		// Teardown (4th)
	}

}
