import java.util.Scanner;

public class CalculatorController {

	public CalculatorController() {
		double n1, n2;
		String operation;

		InputReader inputreader = new InputReader();

		n1 = inputreader.getN1();
		n2 = inputreader.getN2();
		operation = inputreader.getOperation();

		switch (operation) {
		case "+":
			System.out.println("Your answer is " + (n1 + n2));
			break;

		case "-":
			System.out.println("Your answer is " + (n1 - n2));
			break;

		case "/":
			System.out.println("Your answer is " + (n1 / n2));
			break;

		case "*":
			System.out.println("Your asnwer is " + (n1 * n2));
			break;

		default:
			System.out.println("Je ne sais pas");

		}
	}
}
