import java.util.Scanner;

public class DisariumNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scan.nextInt();
		int count = 0;
		int temp = num;
		for (; num > 0; num /= 10)
			count++;
		num = temp;
		int sum = 0;
		while (num > 0) {
			int dig = num % 10;
			int product = 1;
			for (int i = 1; i <= count; i++) {
				product *= dig;
			}
			count--;
			sum += product;
			num /= 10;
		}
		if (sum == temp)
			System.out.println("the entered number is disarium number");
		else
			System.out.println("the entered number is not disarium number");
	}
}
