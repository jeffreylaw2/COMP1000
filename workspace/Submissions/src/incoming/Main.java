package incoming;
import java.util.Scanner;

public class Main {
	// Here's a method that takes a string, a scanner, and returns a string
	public static String getInput(String prompt, Scanner scanner) {
		// print out the prompt
		System.out.format("Enter %s: ", prompt);
		// Grab a line from the keyboard and return it
		return scanner.nextLine();
	}
	public static void main(String[] args) {
		// This reads from the keyboard
		Scanner scanner = new Scanner(System.in);

		// These store text
		String noun, verb, verb1, adjective, adjective1;
		
		// Input prompts
		noun = getInput("a noun", scanner);
		verb = getInput("a verb", scanner);
		verb1 = getInput("another verb", scanner);
		adjective = getInput("an adjective", scanner);
		
		System.out.format("You %s a %s %s!\n" +
		"And this %s just super long,\n" +
		"and that's not very nice in this situation.\n",
		verb, adjective, noun, verb1);		
	}
	
	// code doesn't go here
}
