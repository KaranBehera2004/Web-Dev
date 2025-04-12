import java.util.Scanner;
class Frequencyelement
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of elements of an array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		int i,count=0;
		System.out.println("Enter " + n + " elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter choose a number:");
		int ch=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(ch==a[i])
			{
				count=count+1;
			}
		}
		System.out.println(ch + " is " + count + " times repeate in the given array.");
	}
}	