package incoming;

public class Review {

	public static int sum(int[] array) {
		int result = 0;
		
		/* For loop */
		for (int i = 0; i < array.length; i++) {
			result += array[i];
		}
		
		/* For each loop */
		for (int element : array) {
			result += element;
		}
		
		/* Equivalent while loop */
		int i = 0;
		while (i < array.length) {
			result += array[i];
			i++;
		}
		return result;
	}

	public static void evil(boolean condition1, boolean condition2) {
		if (condition1)
		{
			System.out.println("something");
		}

		// is the same as

		if (condition1) {
		}

		{
			System.out.println("Hi");
		}

		if (condition2);
		{
			System.out.println("Bye");
		}
	}

	public static void main(String[] args) {
		int some_value = 99/100 + 4 + 5/2;
		//		System.out.println(some_value);
		//		evil(true, false);
		System.out.println(sum(new int[] { 1, 2, 3 }));
	}

}
