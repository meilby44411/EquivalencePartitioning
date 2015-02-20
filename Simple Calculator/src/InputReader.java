import java.util.Scanner;

/**
 * The class is responsible for reading user input and performing basic
 * validation before making it avaible
 * 
 * @author Meilby
 *
 */
public class InputReader {
	private Scanner scanner;
	private double n1, n2;
	private String operation;

	public InputReader() {
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

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

}
