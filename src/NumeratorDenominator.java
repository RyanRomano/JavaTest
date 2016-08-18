import java.util.Scanner;


public class NumeratorDenominator {

	public static void main(String[] args) {
		
		//declaring values in cyberspace
		int numerator;
		int denominator;
		
		// Creating a scanner to fetch the user input
		Scanner scanner = new Scanner( System.in );
		
		// calling scanner.next to get the numerator input
		System.out.print("Enter a numerator: ");
		String numeratorInput = scanner.next();
		
		// calling scanner.next to get the denominator input
		System.out.print("Enter a denominator: ");
		String denominatorInput = scanner.next();
		
		// Getting the int values from a string value
		numerator = Integer.parseInt(numeratorInput);		
		denominator = Integer.parseInt(denominatorInput);
	
		// Evaluating the fraction as a double and printing the result. 
		double decimalOutput = ((double) numerator) / denominator;
		System.out.println(decimalOutput);
	}

}
