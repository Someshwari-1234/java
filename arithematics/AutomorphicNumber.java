import java.util.Scanner;

public class AutomorphicNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a new number");
		int num = scan.nextInt();
		int count = (int) Math.log10(num) + 1;
		int devide = (int) Math.pow(10, count);
		int square = num * num;
		if (num == square % devide)
			System.out.println("the entered Number is Automorphic Number");
		else
			System.out.println("the entered number is not Automorphic Number");
	}
}
