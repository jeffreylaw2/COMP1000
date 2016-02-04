package incoming;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class MoreArrays {
	// count up some characters
	public static int[] counts(URL url) throws IOException {
		// Initialize everything
		int[] array = new int[256];
		// Connect to URL
        URLConnection connection = url.openConnection();
        // Create a reader object
        BufferedReader in = new BufferedReader(new InputStreamReader(
                                    connection.getInputStream()));
        // Now let's read from this thing
        String inputLine;
        
        // Read from the reader
        // Read in a line, and as long as there is a line...
        while ((inputLine = in.readLine()) != null) {
        		count(inputLine, array);
        		// Print it out
        		System.out.println(inputLine);
        }
        
        // Clean up
        // Close the reader
        	in.close();
        // this is our happy place
		return array;
	}
	private static void count(String inputLine, int[] array) {
		// go through each character of the string
		for (char c : inputLine.toCharArray()) {
			// array[c] = array[c] + 1;
			array[c]++;
		}
	}
	public static void main(String[] args) throws IOException {
		int[] array =
			counts(new URL("https://ia801405.us.archive.org/18/items/alicesadventures19033gut/19033.txt"));
		int[] array2 = new int[256];
		count("hello", array2);
		System.out.println(array2['l']);
		System.out.println(array2['o']);
		System.out.println(array['.']);
		System.out.println(array[' ']);
		System.out.println(array[',']);
	}
}
