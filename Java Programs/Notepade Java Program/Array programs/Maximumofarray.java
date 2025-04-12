import java.util.Scanner;
class Maximumofarray
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of elements of an array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter " + n + " elements");
		int i;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Maximum of an array is:" + max);
	}
}