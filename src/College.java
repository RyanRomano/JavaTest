/*
 This program prompts for and stores user input into variables, 
 and then uses those variables to fill an ad-lib
 style paragraph with a personal message and 
 prints to console

Issues - When entering input for college, 
Rowan University evaluates as two inputs. 
"I'm enjoying my time at Rowan, though 
I miss my dog University very much!"
And does not prompt user to enter a value for 
their dog's name.

Enter your name: Ryan
Enter your age: 24
Enter your college: Rowan
Enter your dog's name: Stanley
Hello, my name is Ryan and I am 24 years
old. I'm enjoying my time at Rowan, though
I miss my dog Stanley very much!
 * 
 * 
 */


import java.util.Scanner;


public class College {

	public static void main(String[] args) {

		// Creating a scanner to fetch the user input
		Scanner scanner = new Scanner( System.in );

		// calling scanner.next to get the user NAME input
		System.out.print("Enter your name: ");
		String nameInput = scanner.nextLine();

		// calling scanner.next to get the user AGE input
		System.out.print("Enter your age: ");
		String ageInput = scanner.nextLine();

		// calling scanner.next to get the user COLLEGE input
		System.out.print("Enter your college: ");
		String collegeInput = scanner.nextLine();

		// calling scanner.next to get the user DOG NAME input
		System.out.print("Enter your dogs name: ");
		String dogInput = scanner.nextLine();

		// Takes stored user input strings and injects them into message string.
		System.out.println("Hello, my name is " + nameInput
				+ " and I am " + ageInput + " years\nold. I'm enjoying my time at "
				+ collegeInput + ", though\nI miss my dog " + dogInput + " very much!");
	}

}
