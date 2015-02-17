
public class Adder {
	
	public int add(int a, int b ) throws Exception {
		if (a < -1000000000 || b < -1000000000 || a > 1000000000 || b > 1000000000)
			throw new Exception();
		
		return a + b;
	}

}
