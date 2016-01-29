package incoming;

import java.util.Scanner;

public class StringEqualityTesting {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		// read input
		System.out.print("Enter a unit: ");
		String unit = keyboard.nextLine();
		System.out.print("Enter a desired unit: ");
		String desiredUnit = keyboard.nextLine();
		System.out.print("Enter the measurement: ");
		double measurement = keyboard.nextDouble();
		
		// do computation
		// Convert to some canonical unit
		measurement = measurement * toBaseUnit(unit);
		// Convert from canonical unit to desiredUnit
		measurement = measurement * toUnit(desiredUnit);
		
		// Present output
		System.out.println(measurement);
	}
	
	/**
	 * Convert from meters, grams, seconds, etc. to desired unit
	 */
	public static double toUnit(String desiredUnit) {
		return 0;
	}

	/**
	 * Convert to meters, grams, seconds, etc.
	 */
	public static double toBaseUnit(String unit) {
		if (unit.equals("km")) {
			return 1000;
		} else if (unit.equals("in")) {
			return 0.0254;
		} else if (unit.equals("cm")) {
			return 0.01;
		}
		System.out.println("Unknown unit");
		return 1;
	}
}
