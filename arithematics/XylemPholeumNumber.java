import java.util.Scanner;
public class XylemPholeumNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scan.nextInt();
		int lastDigit = num % 10;
		num /= 10;
		int innerDigit = 0;
		while (num > 10) {
			int digit = num % 10;
			innerDigit += digit;
			num /= 10;
		}
		int outerDigit = lastDigit + num;
		if (outerDigit == innerDigit)
			System.out.println("the entered number is Xylem Number");
		else
			System.out.println("the entered number is Pholeum Number");
	}
}
