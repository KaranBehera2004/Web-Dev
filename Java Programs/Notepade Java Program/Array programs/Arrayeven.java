import java.util.Scanner;
class Arrayeven
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of elements of an array:");
		int n=sc.nextInt();	
		int i;
		int array[]=new int[n];
		System.out.println("Enter " + n + " elements");
		for(i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("Even elements:");
		for( i=0;i<n;i++)
		{
			if(array[i]%2==0)
			{
				System.out.print(array[i] + "\t");
			}
		}
	}
}