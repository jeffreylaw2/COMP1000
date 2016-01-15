import java.util.Scanner;

public class AnotherClass {
	private void example() {
		// All data, and all methods (functions)
		// have associated identifiers
		// number is an integer with value zero
		// variables are a box into which you put data
		// type identifier = initial_value;
		// int number = 0.1; // this is clearly wrong
		// just force it into an integer
		int number = (int) 0.1; // this is called type-casting
		// this modifies number
		number = number + 1;
		// prints 1
		System.out.println(number);
	}

	// This defines a method called hello
	public static void hello(String name) {
		System.out.print("Hello, ");
		System.out.println(name);
	}

	public static void someTypes() {
		// type name;
		// a number like say, 42 is a literal
		// an integer includes -2, -1, 0, 1, 2, ...
		// integers are represented using 32 bits
		int this_is_an_integer = 37;
		// long are 64-bit integers
		long this_is_a_long_integer = 2939857430305L; // the L at the end
														// indicates a long
		// float is a real number but it has limited precision
		float e = (float) 2.78;
		// double is also a real number but has better precision
		double pi = 3.14159;
		// char refers to symbols, letters, punctuation, etc.
		char letter = 'a';
		// a string is just a bunch of characters in a sequence
		String this_is_some_text;
		// boolean refers to true or false
		boolean expression = true;
	}

	// This is the entry point because it's main
	public static void main(String[] args) {
		// The type is Scanner, the name is scanner
		// Scanner provides a nice interface to System.in
		// Scanner gives access to the keyboard
		Scanner scanner = new Scanner(System.in);
		// The string is where we put the result
		String name;
		int age;
		// byte age; // 8-bit integer
		// Input
		System.out.print("Enter your name: ");
		long start = System.nanoTime();
		name = scanner.nextLine();
		System.out.print("Enter your age: ");
		age = scanner.nextShort();

		// Output
		hello(name);
		System.out.println("Your age is " + age);
		// This is an if/else statement
		if (age < 30) {
			System.out.println("You're awesome");
		} else {
			System.out.println("OMG, you're soo old!");
		}
		
		System.out.println("You were born sometime around ");
		System.out.println(2016 - age);

		// This is known as a loop
		while (age > 0) {
			// if the condition (age > 0) is true, do the following:
			age = age - 1;
			System.out.println(2016 - age);
		} // go back to the start of the loop
		
		System.out.println(System.nanoTime() - start);
	}
}
