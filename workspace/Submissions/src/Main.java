import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String noun, verb, adjective, adjective1, adverb, noun1, noun2, adjective2;
		System.out.print("Enter a noun:  ");
		noun = scanner.nextLine();
		System.out.print ("Enter a adjective:  ");
		adjective = scanner.nextLine ();
		System.out.print ("Enter a verb:  ");
		verb = scanner.nextLine  ();
		System.out.print ("Enter a adverb: ");
		adverb = scanner.nextLine  ();
		System.out.print ("Enter a different noun:  ");
		noun1 = scanner.nextLine  ();
		System.out.print ("Enter another noun: ");
		noun2 = scanner.nextLine  ();
		System.out.print ("Enter another adjective2: ");
		adjective2 = scanner.nextLine  ();
		
		
		System.out.print("There are so many " + adjective + 
				" ways to put your " + noun + 
				" in my " + noun1 + 
				". However I do not " + verb + 
				" it if you do it so " + adverb + 
				" . Please be more " + adjective2 +
				" the next time you put your " + noun +
				" there" +
				".\nThank you to the " + noun2 + 
				" for reading this " + adjective +
				" story!");
	}
}
	
