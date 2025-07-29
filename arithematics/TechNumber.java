import java.util.Scanner;

public class TechNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scan.nextInt();
		int count = 0;
		int temp = num;
		while (num > 0) {
			count++;
			num /= 10;
		}
		System.out.println("count  " + count);
		if (count % 2 == 0) {
			num = temp;
			int devide = (int) Math.pow(10, count / 2);
			int rightHalf = num % devide;
			int leftHalf = num / devide;
			int sum = rightHalf + leftHalf;
			int sqr = (int) Math.pow(sum, 2);
			if (num == sqr)
				System.out.println("it is a tech number");
			else
				System.out.println("it is not a tech number");
		} else
			System.out.println("the entered number is invalid");
	}
}
