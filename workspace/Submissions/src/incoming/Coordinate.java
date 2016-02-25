package incoming;

import java.util.Scanner;

public class Coordinate {
	final String label;
	final double x;
	final double y;
	final double z;
	public double distance(Coordinate other) {
		System.out.println(this.label);
		// sqrt(A^2 + B^2)
		return Math.sqrt((other.x - x)*(other.x - x)
				+ (other.y - y)*(other.y - y));
	}
	// Constructor
	public Coordinate(String label, int x, int y, int z) {
		this.label = label;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String secret = "Nice";
		char x =secret.toCharArray()[0];

		String word;
		System.out.print("Enter a word: ");
		word = input.next();
		if (word.equals(secret)) {
			System.out.println("hey");
		}
		Coordinate here = new Coordinate("here", 0,0,0);
		Coordinate there = new Coordinate("there", 2, 2, 0);
		System.out.println(here.distance(there));
//		System.out.println(there.z);
	}
}
