package lab3;

public class IntArrayExample {
	public static void main(String[] args) {
		// Declare an array of integers, and initialize it
		// also allocat an array of length 5
		int[] numbers = new int[5];
		// initialize each array element
		// arrays start at index zero
		// array[index] = value
		numbers[0] = 42;
		numbers[1] = 37;
		numbers[2] = 55;
		numbers[3] = 52;
		numbers[4] = 28;
		// arrays end at index size - 1
		System.out.println(min(numbers));
		System.out.println(max(numbers));
		System.out.println(sum(numbers));
		System.out.println(average(numbers));
	}

	public static char[] average(int[] numbers) {
		// TODO Auto-generated method stub
		return null;
	}

	public static char[] sum(int[] numbers) {
		// TODO Auto-generated method stub
		return null;
	}

	public static char[] max(int[] numbers) {
		// TODO Auto-generated method stub
		return null;
	}

	public static int min(int a, int b) {
		if (a < b) {
			return a;
		}
		return b;
	}
	// Compute the minimum of an array of integers
	public static int min(int[] numbers) {
		int theMin = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			theMin = min(theMin, numbers[i]);
		}
		return theMin;
	}
}
