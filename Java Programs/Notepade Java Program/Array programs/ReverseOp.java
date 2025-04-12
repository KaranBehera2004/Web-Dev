import java.util.Scanner;
class Reverse
{
	int n;
	
	void set(int num)
	{
		n=num;
	}
	
	int reverse(int n)
	{
		int rem,rev=0;
		while(n==0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}	
}

class ReverseOp
{
	public static void main(String args[])
	{
		Scanner s=new Scanner();
		System.out.println("Enter a number:");
		int n=s.nextInt();
		Reverse r=new Reverse();
		r.set(n);
		int rev=r.reverse(n);
		System.out.println("Reverse of a number: " + rev);
	}
}
			