import java.util.Scanner;
 
public class NumberGuessingGame {
      public static void main(String[] args) {
            int RandomNumber;
            RandomNumber = (int) (Math.random() * 99 + 1);           
            Scanner keyboard = new Scanner(System.in);
            int guess;
            do {
                  System.out.print("Enter a number between 1 and 100: ");
                  guess = keyboard.nextInt();
                  if (guess == RandomNumber)
                        System.out.println("You won!");
                  else if (guess < RandomNumber)
                        System.out.println("Your guess is smaller than the secret number.");
                  else if (guess > RandomNumber)
                        System.out.println("Your guess is greater than the secret number.");
            } while (guess != RandomNumber);
      }
}