import java.util.Scanner;  // Import Scanner class to read input

public class AdditionProgram {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();  // Read the first number

        // Ask the user for the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();  // Read the second number

        // Add the two numbers
        int sum = num1 + num2;

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
