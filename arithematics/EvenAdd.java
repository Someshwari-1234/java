import java.util.Scanner;

public class EvenAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) { // check even
                sum += i;
            }
        }
        
        System.out.println("Sum of even numbers from 1 to " + num + " is: " + sum);
    }
}
