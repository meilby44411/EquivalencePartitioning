import java.util.Scanner;

public class CalculatorController {

	double n1, n2;
	String operation;
	Scanner scannerObject = new Scanner(System.in);

	public CalculatorController() {
		System.out.println("Enter first number");
		n1 = scannerObject.nextDouble();

		System.out.println("Enter second number");
		n2 = scannerObject.nextDouble();

		Scanner op = new Scanner(System.in);
		System.out.println("Enter your operation");
		operation = op.next();

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
