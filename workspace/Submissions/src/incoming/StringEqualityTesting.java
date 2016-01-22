package incoming;

import java.util.Scanner;

public class StringEqualityTesting {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double measurement = keyboard.nextDouble();
		String unit = keyboard.next();
		if (measurement == 1.0) {
			System.out.println("one is the loneliest number");
		}
		if (unit.equals("km")) {
			System.out.println("what?!? metric");
		} else {
			System.out.println("hmm");
		}
		System.out.println(measurement);
	}
}
