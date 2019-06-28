import java.util.Random;
import java.util.Scanner;

public class Dice {
	public static void main(String[] args) {
		Scanner scrn = new Scanner(System.in);
		String userInput;

		System.out.println("Werlcome to the Grand Circus Casino!");

		do {

			/*
			 * System.out.println("How many sides should each die have?");
			 *  int die1 = scrn.nextInt();
			 * scrn.nextInt(); die1 = (int) (Math.random() * die1) + 1;
			 */

			

			

			RandomDieRoll(Ask(), 1);

			RandomDieRoll(Ask(), 2);

			System.out.println("Roll again? (y/n) ");
			userInput = scrn.next();

		} while (userInput.equalsIgnoreCase("y"));

	}

	public static int RandomDieRoll(int roll, int count) {
		Random rand = new Random();
		int die2 = rand.nextInt(roll) + 1;
		System.out.println("Roll " + count + ":" + die2);

		return die2;
	}

	public static int Ask() {
		
		Scanner scrn = new Scanner(System.in);
		System.out.println("How many sides should each die have?");
		
		int die1 = scrn.nextInt();

		return die1 = (int) (Math.random() * die1) + 1;

	}
}
