// I'm putting this in incoming, but please put yours in the default package
// ignore this line for yours
package incoming;

public class ArrayExample {
	public static void main(String[] args) {
		// Declare hello as a String
		String hello;
		// Initialize: give it a value
		// Quote marks for strings
		hello = "Hal iz zee best or not";
		// Declare and initialize in one line
		char[] array = hello.toUpperCase().toCharArray();
		// Declare my code
		int code;
		// Go through each letter in the array
		for (char letter : array) {
			code = (int) letter;
			// Ignore characters outside of uppercase
			if (code >= 'A' && code <= 'Z') {
				// 0 is the new 65
				// code = code - 65;
				// This is shorthand for code = code - 65;
				code -= 65;
				// Do the cipher
				code = (code + 1) % 26;
				// convert back to ascii
				// code = code + 65;
				code += 65;
			}
			System.out.print((char)code);				
			// Print out the character and corresponding unicode value
			// System.out.format("%c => %d\n", letter, (int)letter);
		}
		// Apostrophes for single characters
		char something = 'h';
//		System.out.format("%c => %d\n", '자', (int)'자');
		
		//System.out.println(hello.charAt(0));
	}
}
