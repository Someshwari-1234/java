import java.util.Scanner;

public class EvilNumber {
	public static void main(String[] args) {
		int count = 0, bin = 0, i = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scan.nextInt();
		if (num > 0) {
			while (num != 0) {
				int rem = num % 2;
				bin = rem * i + bin;
				num /= 2;
				i = i * 10;
			}
			System.out.println(bin);
			while (bin > 0) {
				int rem2 = bin % 10;
				if (rem2 == 0) {
					count++;
				}
				bin /= 10;
			}
			System.out.println(count);
			if (count % 2 == 0)
				System.out.println("the entered number is EvilNumber");
			else
				System.out.println("the entered number is not EvilNumber");
		}
	}
}
