import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to add: ");
        int n = sc.nextInt();

        int sum = 0;
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sum += num;  // add to sum
        }

        System.out.println("The sum of numbers is: " + sum);
        sc.close();
    }
}
