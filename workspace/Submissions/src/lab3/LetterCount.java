package lab3;
import java.util.Arrays;
import java.util.Scanner;

public class LetterCount {
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);
		int[] arr;
		arr = new int[26];
		int[] arr2;
		arr2 = new int[26];
		System.out.println("Please enter a statement: ");
		String input = keyboard.nextLine();
		// arrays end at index size - 1
		
		for(int i = 0; i < input.length(); i++){
			//System.out.println(input.toLowerCase().charAt(i));
			if(input.toLowerCase().charAt(i) >= 97 && input.toLowerCase().charAt(i) <= 122)
			arr[((int)input.toLowerCase().charAt(i) - 97)]++;
		}
		
		for(int i = 0; i < arr.length; i++){
			System.out.println((char)(i + 97) + " " + arr[i]);
		}
		System.out.println("Sum: " + sum(arr));
		System.out.println("Max: " + max(arr));
		System.out.println("Min: " + min(arr));
		System.out.println("Average: " + avg(arr));
		
		System.out.println("Please enter a word: ");
		String input3 = keyboard.nextLine();
		System.out.println("Please enter another word: ");
		String input4 = keyboard.nextLine();
        String str1 = input3;
        String str2 = input4;
        if (isAnagram(str1, str2)) {
            System.out.println(str2 + "and" + str1 + "are anagrams.");
        } else {
            System.out.println("Strings are not anagrams.");
        }
		
	
	
	}
	
	 private static boolean isAnagram(String str1, String str2) {
		 
	        // If string lengths are not same, the strings are not anagrams.
	        if (str1.length() != str2.length()) {
	            return false;
	        }
	 
	        // Sort characters of both the strings.
	        str1 = sortCharacters(str1);
	        str2 = sortCharacters(str2);
	 
	        // After sorting if strings are equal then they are anagrams.
	        return str1.equals(str2);
	    }
	 
	    private static String sortCharacters(String str) {
	        char[] charArray = str.toLowerCase().toCharArray();
	        Arrays.sort(charArray);
	        return String.valueOf(charArray);
	    }


	public static int max(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
	         if (max < arr[i]){
	        	 max = arr[i];
	         }
	      }
		return max;
	}

	public static int sum(int[] arr) {
		// TODO Auto-generated method stub
		int sum = 0;
	      for (int i = 0; i < arr.length; i++) {
	         sum += arr[i];
	      }
		return sum;
	}

	public static int avg(int[] arr) {
		int avg = sum(arr);
		avg = avg/arr.length;
		return avg;
	}

	public static int min(int[] arr) {
		int min = 0;
		for (int i = 0; i < arr.length; i++) {
	         if (min > arr[i]){
	        	 min = arr[i];
	         }
	      }
		return min;
	}


	
}
