import java.util.Scanner;

public class Power {
    // a^b for real a and integer b, without using Math.pow
    public static double power(double a, int b) {
        long e = b;                 // use long to safely take abs
        boolean neg = e < 0;
        if (neg) e = -e;

        double result = 1.0;
        double base = a;

        while (e > 0) {
            if ((e & 1L) == 1L) result *= base; // multiply when the bit is 1
            base *= base;                        // square the base
            e >>= 1;                             // shift to next bit
        }
        return neg ? 1.0 / result : result;
    }

    // Optional: integer-only version (beware of overflow)
    public static long powerInt(long a, long b) {
        if (b < 0) throw new IllegalArgumentException("Exponent must be non-negative for integer power.");
        long result = 1, base = a, e = b;
        while (e > 0) {
            if ((e & 1L) == 1L) result *= base;
            base *= base;
            e >>= 1;
        }
        return result;
    }

    // Optional: modular power (useful in coding interviews / CP)
    public static long modPow(long a, long b, long mod) {
        if (mod <= 0) throw new IllegalArgumentException("mod must be positive");
        long result = 1 % mod;
        long base = ((a % mod) + mod) % mod;
        long e = b;
        while (e > 0) {
            if ((e & 1L) == 1L) result = (result * base) % mod;
            base = (base * base) % mod;
            e >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base (double): ");
        double a = sc.nextDouble();
        System.out.print("Enter exponent (int): ");
        int b = sc.nextInt();
        System.out.println("Result = " + power(a, b));

        // Examples:
        // System.out.println(power(2, 10));     // 1024.0
        // System.out.println(power(5, -3));     // 0.008
        // System.out.println(powerInt(2, 10));  // 1024
        // System.out.println(modPow(2, 10, 1000000007)); // 1024
    }
}
