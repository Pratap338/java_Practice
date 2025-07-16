import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String again = "y";

        while (again.equalsIgnoreCase("y")) {
            // Ask user for two numbers
            System.out.print("Enter first number: ");
            double num1 = input.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = input.nextDouble();

            // Ask user for the operation
            System.out.print("Enter operation (+, -, *, /): ");
            char op = input.next().charAt(0);

            double result;
            boolean valid = true;

            // Perform the operation
            if (op == '+') {
                result = num1 + num2;
                System.out.println("Result: " + result);
            } else if (op == '-') {
                result = num1 - num2;
                System.out.println("Result: " + result);
            } else if (op == '*') {
                result = num1 * num2;
                System.out.println("Result: " + result);
            } else if (op == '/') {
                // Handle division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                    valid = false;
                }
            } else {
                System.out.println("Invalid operation.");
                valid = false;
            }

            // Ask if user wants to continue
            if (valid) {
                System.out.print("Do you want to calculate again? (y/n): ");
                again = input.next();
            } else {
                System.out.print("Try again? (y/n): ");
                again = input.next();
            }
        }

        System.out.println("Thank you for using the calculator!");
        input.close();
    }
}
