import java.util.Scanner;
import java.util.Random;

public class FirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		
		// calling scanner.next to get the user's first name
				System.out.println("**Welcome to MCCC Online. Please enter the following "
						+ "information to be registered in our database.\n");
				System.out.print("Enter your first name: ");
				String firstNameInput = scanner.nextLine();

		// calling scanner.next to get the user's first name
				System.out.print("Enter your last name: ");
				String lastNameInput = scanner.nextLine();
				
		//getting the first letter of first name and storing it into variable
				String firstLetter = firstNameInput.substring(0,1);
	
	
		//getting the 0-/5 letter of last name and storing it into variable
				String lastLetter = lastNameInput.substring(0, 5);
	
		//generates a random number 
				Random someRandomNumber = new Random();
				int lowRandom = 10;
				int highRandom = 100;		
				int theNumberWeNeed = someRandomNumber.nextInt((highRandom-lowRandom) 
						+ lowRandom);
	
		//Creates the string with the substringed names and random number generated
				System.out.println("Your username is: " + firstLetter.toLowerCase() 
						+ lastLetter.toLowerCase() + theNumberWeNeed);
	
		//BONUS: Prompts for & verifies for a password		
				System.out.print("Please enter a password: ");
				String password = scanner.nextLine();
				System.out.println("The password you entered is: " + password);
				System.out.print("Retype password to verify: ");
				String passwordVerify = scanner.nextLine();
		//Logic to compare password input	
				if	( password.equals(passwordVerify)) {
					System.out.print("\nYour passwords match.\nThank you for registering with the MCCC database.");
				}
				
				else {
					System.out.println("Your passwords do not match! Please try again!");
				}
				
	}
}


