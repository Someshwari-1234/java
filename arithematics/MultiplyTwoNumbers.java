import java.util.Scanner;

public class MultiplyTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Multiplication
        int product = num1 * num2;

        // Output
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);

        sc.close();
    }
}
