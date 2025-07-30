import java.util.Scanner;
public class SpyNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scan.nextInt();
		int sum = 0;
		int product = 1;
		while (num > 0) {
			int lastDigit = num % 10;
			sum += lastDigit;
			product *= lastDigit;
			num /= 10;
		}
		if (sum == product)
			System.out.println("the entered number is Spynumber");
		else
			System.out.println("the entered number is not Spynumber");
	}
}
