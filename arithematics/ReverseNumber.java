import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int rev = 0;   // variable to store reversed number

        while (num != 0) {
            int digit = num % 10;   // get last digit
            rev = rev * 10 + digit; // append digit to reverse
            num = num / 10;         // remove last digit
        }

        System.out.println("Reversed Number: " + rev);

        sc.close();
    }
}
