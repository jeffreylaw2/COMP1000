package incoming;

import java.util.Random;
import java.util.Scanner;

public class TryThis {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int guess;
		int target = new Random().nextInt(100) + 1;
		
		do {
			System.out.print("Enter a guess [1-100]: ");
			guess = input.nextInt();
			if (guess < 1 || guess > 100) {
				System.out.println("Invalid guess");
			}
			else if (guess > target) {
				System.out.println("Too high");
			}
			else if (guess < target) {
				System.out.println("Too low");
			}
			else if (guess == target) {
				System.out.println("You won!");
			}
		} while (guess != target);
	}
}
