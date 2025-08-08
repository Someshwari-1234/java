import java.util.Scanner;

public class SunnyNumber {
  
    static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

  
        if (isPerfectSquare(num + 1)) {
            System.out.println(num + " is a Sunny Number.");
        } else {
            System.out.println(num + " is NOT a Sunny Number.");
        }

        sc.close();
    }
}
