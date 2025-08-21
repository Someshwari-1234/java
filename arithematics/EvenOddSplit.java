import java.util.Scanner;

public class EvenOddSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String even = "";
        String odd = "";

        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                even = digit + " " + even;
            } else {
                odd = digit + " " + odd;
            }
            num /= 10;
        }

        System.out.println("Even digits: " + even);
        System.out.println("Odd digits: " + odd);

        sc.close();
    }
}
