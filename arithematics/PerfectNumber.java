import java.util.Scanner;
public class PerfectNumber {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a number");
	int num=scan.nextInt();
	int sum=0;
	for(int i=1;i<=num/2;i++)
	{
		if(num%i==0)
			sum+=i;
	}
		if(num==sum)
			System.out.println("it is a perfect number");
		else
			System.out.println("it is not a perfect number");
}
}
