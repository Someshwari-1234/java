import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scan.nextInt();
        int temp = num;

        // Find the count of digits
        int count = 0;
        int tempNum = num;
        while (tempNum != 0) {
            count++;
            tempNum /= 10;
        }

        // Calculate Armstrong sum
        int sum = 0;
        tempNum = num;
        while (tempNum != 0) {
            int dig = tempNum % 10;
            int prod = 1;
            for (int i = 0; i < count; i++) {
                prod *= dig;
            }
            sum += prod;
            tempNum /= 10;
        }

        // Compare and display result
        if (temp == sum)
            System.out.println("The entered number is an Armstrong Number");
        else
            System.out.println("The entered number is not an Armstrong Number");

        scan.close();
    }
}
