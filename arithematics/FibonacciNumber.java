import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number (number of terms): ");
        int num = sc.nextInt();
        sc.close();

        if (num <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Print sequence
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;

        System.out.print("Fibonacci sequence (" + num + " terms): ");
        for (int i = 1; i <= num; i++) {
            System.out.print(a + (i < num ? " " : ""));
            BigInteger next = a.add(b);
            a = b;
            b = next;
        }
        System.out.println();

        // a currently holds F(num) after the loop? Careful:
        // After i==num, 'a' equals F(num), because we print 'a' first then advance.
        System.out.println("F(" + num + ") = " + a);
    }
}
