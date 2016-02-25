package incoming;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int guess;
		int lo = 1;
		int hi = 100;
		int mid = (lo + hi) / 2;
		int target = new Random().nextInt(100) + 1;
		
		do {
			mid = (lo + hi) / 2;
			System.out.format("Enter a guess [%d-%d] (Hint: %d): ", lo, hi, mid);
			guess = input.nextInt();
			if (guess < 1 || guess > 100) {
				System.out.println("Invalid guess");
			}
			else if (guess > target) {
				System.out.println("Too high");
				hi = Math.min(guess, hi);
			}
			else if (guess < target) {
				System.out.println("Too low");
				lo = Math.max(guess, lo);
			}
			else if (guess == target) {
				System.out.println("You won!");
			}
		} while (guess != target);
	}
}
