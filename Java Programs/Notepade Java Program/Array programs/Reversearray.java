import java.util.Scanner;
class Reversearray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of elements of an array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		int rev[]=new int[n];
		System.out.println("Enter" + n + "elements");
		int i;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=n-1;i>=0;i--)
		{
			rev[i]=a[i];
		}
		System.out.println("Reverse of an array:");
		for(i=n-1;i>=0;i--)
		{
			System.out.print(rev[i] + " ");
		}
	}
}