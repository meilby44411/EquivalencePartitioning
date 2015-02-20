import java.util.Scanner;

/**
 * The class is responsible for reading user input and performing basic
 * validation before making it avaible
 * 
 * @author Meilby
 *
 */
public class InputReaderImpl implements InputReader {
	private Scanner scanner;
	private double n1, n2;
	private String operation;

	public InputReaderImpl() {
		scanner = new Scanner(System.in);

		n1 = readDouble("Enter first number");
		n2 = readDouble("Enter second number");

		System.out.println("Enter your operation");
		operation = scanner.next();

	}

	private double readDouble(String promt) {
		System.out.println(promt);
		double n;

		if (scanner.hasNextDouble())
			n = scanner.nextDouble();
		else {
			scanner.nextLine(); // discard current input
			System.out.println("Invalid number");
			n = readDouble(promt);
		}
		return n;

	}

	/* (non-Javadoc)
	 * @see InputReader#getN1()
	 */
	@Override
	public double getN1() {
		return n1;
	}

	/* (non-Javadoc)
	 * @see InputReader#getN2()
	 */
	@Override
	public double getN2() {
		return n2;
	}

	/* (non-Javadoc)
	 * @see InputReader#getOperation()
	 */
	@Override
	public String getOperation() {
		return operation;
	}

	

}
