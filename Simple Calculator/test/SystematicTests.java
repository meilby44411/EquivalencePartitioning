import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SystematicTests {

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
	public void test8PlusNegative100Equals92() {
		assertEquals(-92, new CalculatorControllerStub().getResult(), 0);
	}

	private class CalculatorControllerStub extends CalculatorController {
		public double getResult() {
			return this.result;
		}

		@Override
		protected InputReader newInputReader() {
			return new InputReader() {

				@Override
				public double getN1() {
					return 8;
				}

				@Override
				public double getN2() {
					return -100;
				}

				@Override
				public String getOperation() {
					return "+";
				}

			};
		}
	}

}
