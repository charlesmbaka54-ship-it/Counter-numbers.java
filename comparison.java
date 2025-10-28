// Fig. 2.15 (Modified): Comparison.java
// Compare three integers using if statements, relational operators 
// and equality operators.

import java.util.Scanner; // program uses class Scanner

public class Comparison
{
   // main method begins execution of Java application
   public static void main(String[] args)
   {
      // create Scanner to obtain input from command window
      Scanner input = new Scanner(System.in);

      int number1; // first number to compare
      int number2; // second number to compare
      int number3; // third number to compare

      System.out.print("Enter first integer: "); // prompt
      number1 = input.nextInt(); // read first number from user

      System.out.print("Enter second integer: "); // prompt
      number2 = input.nextInt(); // read second number from user

      System.out.print("Enter third integer: "); // prompt
      number3 = input.nextInt(); // read third number from user

      System.out.println("\n--- Comparison Results ---");

      // Compare all pairs of numbers
      if (number1 == number2)
         System.out.printf("%d == %d%n", number1, number2);
      if (number1 == number3)
         System.out.printf("%d == %d%n", number1, number3);
      if (number2 == number3)
         System.out.printf("%d == %d%n", number2, number3);

      if (number1 != number2)
         System.out.printf("%d != %d%n", number1, number2);
      if (number1 != number3)
         System.out.printf("%d != %d%n", number1, number3);
      if (number2 != number3)
         System.out.printf("%d != %d%n", number2, number3);

      if (number1 < number2)
         System.out.printf("%d < %d%n", number1, number2);
      if (number1 < number3)
         System.out.printf("%d < %d%n", number1, number3);
      if (number2 < number3)
         System.out.printf("%d < %d%n", number2, number3);

      if (number1 > number2)
         System.out.printf("%d > %d%n", number1, number2);
      if (number1 > number3)
         System.out.printf("%d > %d%n", number1, number3);
      if (number2 > number3)
         System.out.printf("%d > %d%n", number2, number3);

      // Find and display the largest and smallest numbers
      int largest = number1;
      if (number2 > largest)
         largest = number2;
      if (number3 > largest)
         largest = number3;

      int smallest = number1;
      if (number2 < smallest)
         smallest = number2;
      if (number3 < smallest)
         smallest = number3;

      System.out.printf("%nLargest number is: %d%n", largest);
      System.out.printf("Smallest number is: %d%n", smallest);
   }
}
