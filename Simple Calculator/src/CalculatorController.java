import java.util.Scanner;

public class CalculatorController {
	protected double result;

	public CalculatorController() {
		double n1, n2;
		String operation;
		

		InputReader inputreader = newInputReader();

		n1 = inputreader.getN1();
		n2 = inputreader.getN2();
		operation = inputreader.getOperation();

		switch (operation) {
		case "+":
			printResult(n1 + n2);
			break;

		case "-":
			printResult(n1 - n2);
			break;

		case "/":
			printResult(n1 / n2);
			break;

		case "*":
			printResult(n1 * n2);
			break;

		default:
			System.out.println("Je ne sais pas");

		}
	}

	private void printResult(double result) {
		this.result = result;
		System.out.println("Your awnser is " + result);
	}

	protected InputReader newInputReader() {
		return new InputReaderImpl();
	}
}
