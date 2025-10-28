import java.util.Scanner;

public class NumberTypeCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int integerCount = 0; // counts integers
        int totalCount = 0;   // counts all numeric inputs

        System.out.println("Enter numbers (type 'stop' to finish):");

        while (true) {
            System.out.print("Enter value: ");
            String userInput = input.next();

            // Exit condition
            if (userInput.equalsIgnoreCase("stop")) {
                break;
            }

            // Check if input is integer, float, or double
            if (isInteger(userInput)) {
                System.out.println(userInput + " is an Integer.");
                integerCount++;
                totalCount++;
            } else if (isFloat(userInput)) {
                System.out.println(userInput + " is a Float.");
                totalCount++;
            } else if (isDouble(userInput)) {
                System.out.println(userInput + " is a Double.");
                totalCount++;
            } else {
                System.out.println("Invalid input: " + userInput);
            }
        }

        // Display results
        System.out.println("\nSummary:");
        System.out.println("Total numbers entered: " + totalCount);
        System.out.println("Total integers entered: " + integerCount);

        input.close();
    }

    // Method to check if a string is an integer
    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Method to check if a string is a float (ends with f or F)
    public static boolean isFloat(String str) {
        try {
            if (str.endsWith("f") || str.endsWith("F")) {
                Float.parseFloat(str.substring(0, str.length() - 1));
                return true;
            }
            return false;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Method to check if a string is a double (decimal but not ending with f/F)
    public static boolean isDouble(String str) {
        try {
            if (str.contains(".") && !str.endsWith("f") && !str.endsWith("F")) {
                Double.parseDouble(str);
                return true;
            }
            return false;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
