import java.util.Scanner;
class Pallindrom
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		int n;
		n=a;
		int rem,rev=0;
		for(;n!=0;n=n/10)
		{
			rem=n%10;
			rev=rev*10+rem;
		}
		
		System.out.println("Reverse of a number is " + rev);
		
		if(a==rev)
		{
			System.out.println(a + " is a pallindrom nu mber:");
		}
		else
		{
			System.out.println(a +"is not a pallindrom number");
		}
	}
}