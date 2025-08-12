import java.util.Scanner;

public class FascinatingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String concatenated = num + "" + (num * 2) + (num * 3);

        boolean[] digits = new boolean[10]; // index 0-9

        boolean isFascinating = true;
        for (int i = 0; i < concatenated.length(); i++) {
            int digit = concatenated.charAt(i) - '0';
            if (digit == 0 || digits[digit]) { // if 0 or duplicate digit
                isFascinating = false;
                break;
            }
            digits[digit] = true;
        }

        // Check if digits 1–9 are present exactly once
        for (int i = 1; i <= 9 && isFascinating; i++) {
            if (!digits[i]) {
                isFascinating = false;
            }
        }

        if (isFascinating) {
            System.out.println(num + " is a Fascinating Number.");
        } else {
            System.out.println(num + " is NOT a Fascinating Number.");
        }

        sc.close();
    }
}
