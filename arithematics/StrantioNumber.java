import java.util.Scanner;

public class StrontioNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = num * 2;
        int middleTwo = (result / 10) % 100;

        if ((middleTwo / 10) == (middleTwo % 10)) {
            System.out.println(num + " is a Strontio Number.");
        } else {
            System.out.println(num + " is NOT a Strontio Number.");
        }

        sc.close();
    }
}
