import java.util.Scanner;
class HappyNumber
{
public static void main(String [] args)
{
  Scanner scan=new Scanner(System.in);
  System.out.println("enter a number");
  int num=scan.nextInt();
  int sum=0;
  do
  {
    sum=0;
    while(num>0)
    { int lastDigit=num%10;
      sum+=lastDigit*lastDigit;
      num/=10;
    }
    num=sum;
  }
    while(sum>=10);
if(sum==1)
System.out.println("it is a happy number");
else
System.out.println("it is not a happy number");
}
}
