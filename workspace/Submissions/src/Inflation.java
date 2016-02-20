

import java.util.Scanner;

public class Inflation {

   public static void main(String[] args) {


       Scanner in = new Scanner(System.in);

       double currentPrice, rate, futurePrice;

       int years;

       do {

           System.out.print("Enter the current price of the item: ");

           currentPrice = in.nextFloat();

           if (currentPrice < 0) System.out.println("Enter positive value");

       } while (currentPrice < 0);

       do {

           System.out.print("Enter the number of years: ");

           years = in.nextInt();

           if (years < 0)

               System.out.println("Enter positive value");

       } while (years < 0);

       do {

           System.out.print("Enter the inflation rate as a percentage: ");

           rate = in.nextDouble();

           if (rate < 0)

               System.out.println("Enter +ve value");

       } while (rate < 0);

       futurePrice = currentPrice;

       for (int i = 1; i <= years; i++) {

           futurePrice *= (1 + rate / 100);

       }

       futurePrice = Math.round(futurePrice * 100) / 100.0;


       System.out.print("After " + years + " years,the price will be $"

               + futurePrice);

   }

}