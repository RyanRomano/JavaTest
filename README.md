# JavaTest
package chapter5;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);

		int computerHandValue = 0;
		boolean tie = true;
		String userHand = null;
		String computerHand = null;
		String playAgain = "yes";
		int victor = 0;
		
		/*Creates Computer Draw: Random int---> String */
		computerHandValue = rand.nextInt(3) + 1;

		if (computerHandValue == 1) {
			computerHand = "rock";
		}
		if (computerHandValue == 2) {
			computerHand = "paper";
		}
		if (computerHandValue == 3) {
			computerHand = "scissors";
		}

		while (victor == 0) 
		{
			System.out.println("Rock, paper, or scissors?");
			userHand = scan.nextLine();
			userHand = userHand.toLowerCase();

			if (userHand.equals(computerHand))
			{
				System.out.println("Tie, try again.");
				victor = 0;			
				computerHandValue = rand.nextInt(3) + 1;
				System.out.println(computerHand);
				System.out.print(computerHandValue);
			}

			if (userHand.equals("rock") && computerHand.equals("paper")) 
			{
				System.out.println("Paper covers rock, computer wins");
				victor++;

			}
			if (userHand.equals("paper") && computerHand.equals("rock")) {
				System.out.println("Paper covers rock, you win!");
				victor++;

			}
			/* >>>>>>>>>>>>>>>>>>>>Scissors V Paper<<<<<<<<<<<<<<<<< */

			if (userHand.equals("paper") && computerHand.equals("scissors")) {
				System.out.println("Scissors cut paper, computer wins");
				victor++;

			}
			if (userHand.equals("scissors") && computerHand.equals("paper")) {
				System.out.println("Scissors cut paper, you win!");
				victor++;

			}
			/* >>>>>>>>>>>>>>>>>>>>Rock V Scissors<<<<<<<<<<<<<<<<< */

			if (userHand.equals("scissors") && computerHand.equals("rock")) {
				System.out.println("Rock breaks scissors, computer wins");
				victor++;

			}
			if (userHand.equals("rock") && computerHand.equals("scissors")) {
				System.out.println("Rock breaks scissors, you win!");
				victor++;
			}

		}
		
		System.out.println("Good game");
	}
}
