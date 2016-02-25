package incoming;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	int lo = 1;
	int hi = 100;
	int target = new Random().nextInt(100) + 1;
	public int mid() {
		return (lo + hi) / 2;
	}
	enum Outcome { INVALID, TOO_HIGH, TOO_LOW, DONE };
	public Outcome makeGuess(int guess) {
		if (guess < 1 || guess > 100) {
			return Outcome.INVALID;
		}
		else if (guess > target) {
			hi = Math.min(guess, hi);
			return Outcome.TOO_HIGH;
		}
		else if (guess < target) {
			lo = Math.max(guess, lo);
			return Outcome.TOO_LOW;
		}
		else if (guess == target) {
			lo = target;
			hi = target;
			return Outcome.DONE;
		}
		return null;
	}
	public boolean over() {
		return lo == hi;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int guess;
		GuessingGame game = new GuessingGame();
		
		do {
			System.out.format("Enter a guess [%d-%d] (Hint: %d): ", game.lo, game.hi, game.mid());
			guess = input.nextInt();
			switch (game.makeGuess(guess)) {
			case DONE:
				System.out.println("You won!");
				break;
			case INVALID:
				System.out.println("Invalid guess");
				break;
			case TOO_HIGH:
				System.out.println("Too high");
				break;
			case TOO_LOW:
				System.out.println("Too low");
				break;
			default:
				break;
			}
		} while (!game.over());
	}
}
