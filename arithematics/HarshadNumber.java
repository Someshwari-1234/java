import java.util.Scanner;

public class HarshadNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scan.nextInt();
		int sum = 0;
		int temp = num;
		while (num != 0) {
			int lastDigit = num % 10;
			sum += lastDigit;
			num /= 10;
		}
		if (temp % sum == 0)
			System.out.println("the entered number is HarshadNumber");
		else
			System.out.println("the entered number is not HarshadNumber");
	}
}
