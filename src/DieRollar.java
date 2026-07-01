//Class DieRollar
//  main()
//      num die1 = 0
//      num die2 = 0
//      num die3 = 0
//      num sum = 0
//      num rollCount = 0
//      String answer = "placeholder"
//      boolean validInput
//      do
//          // roll until triple
//          rollCount = 0
//          do
//              rollCount = rollCount + 1
//              die1 = random integer between 1 and 6
//              die2 = random integer between 1 and 6
//              die3 = random integer between 1 and 6
//              sum = die1 + die2 + die3
//              output table header on first roll and then a row for this roll
//          while (not all three dice equal)
//          // ask to continue
//          do
//              output "Continue? (y/n): "
//              input answer
//              if (answer == "y" or answer == "n")
//                  validInput = true
//              else
//                  validInput = false
//              endif
//          while (!validInput)
//      while (answer == "y")
//  return
//EndClass

import java.util.Random;
import java.util.Scanner;

public class DieRollar
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double die1 = 0.0;
		double die2 = 0.0;
		double die3 = 0.0;
		double sum = 0.0;
		double rollCount = 0.0;
		String answer = "placeholder";
		Random rand = new Random();

		do
		{
			// Print header for this run (use same field widths as the data rows so headers align)
			System.out.printf("%5s %8s %8s %8s %5s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
			System.out.println("----------------------------------------------------------");

			rollCount = 0.0;
			// Roll until triple
			do
			{
				rollCount = rollCount + 1.0;
				die1 = (double) (rand.nextInt(6) + 1);
				die2 = (double) (rand.nextInt(6) + 1);
				die3 = (double) (rand.nextInt(6) + 1);
				sum = die1 + die2 + die3;

				// Print row: use printf to align columns
				System.out.printf("%5.0f %8d %8d %8d %5.0f%n",
						rollCount,
						(int) die1,
						(int) die2,
						(int) die3,
						sum);

			}
			while (!((int) die1 == (int) die2 && (int) die2 == (int) die3));

			// Ask the user whether to continue
			System.out.print("Continue? (y/n): ");
			if (in.hasNextLine()) {
				answer = in.nextLine().trim().toUpperCase();
			}
			else
			{
				answer = "N";
			}


		} while (answer.charAt(0) == 'Y');
	}
}
