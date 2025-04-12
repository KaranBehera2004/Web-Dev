import java.util.Scanner;
class Reverse
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int rem,rev=0;
		for(;n!=0;n=n/10)
		{
			rem=n%10;
			rev=rev*10+rem;
		}
		
		System.out.println("Reverse of a number is " + rev);
	}
}