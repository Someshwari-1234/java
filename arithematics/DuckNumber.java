import java.util.Scanner;

public class DuckNumber {
    // Returns true if s is a duck number
    private static boolean isDuck(String s) {
        if (s == null || s.isEmpty()) return false;

        // Allow optional '+' sign
        int i = 0;
        if (s.charAt(0) == '+') i = 1;

        // Must have at least one digit and be all digits after optional sign
        if (i >= s.length()) return false;
        for (int k = i; k < s.length(); k++) {
            if (!Character.isDigit(s.charAt(k))) return false;
        }

        // Leading zero not allowed (after optional '+')
        if (s.charAt(i) == '0') return false;

        // Check for any '0' in the rest of the digits
        for (int k = i + 1; k < s.length(); k++) {
            if (s.charAt(k) == '0') return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = sc.nextLine().trim();

        if (isDuck(input)) {
            System.out.println(input + " is a Duck number");
        } else {
            System.out.println(input + " is NOT a Duck number");
        }
        sc.close();
    }
}
