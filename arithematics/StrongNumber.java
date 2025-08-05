import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scan.nextInt();
		int sum = 0;
		int temp = num;
		for (; num > 0; num /= 10) {
			int lastDigit = num % 10;
			int fact = 1;
			while (lastDigit > 1) {
				fact *= lastDigit;
				lastDigit--;
			}
			sum = sum + fact;
		}
		if (temp == sum)
			System.out.println("it is Strong Number");
		else
			System.out.println("it is not Strong Number");
	}
}
