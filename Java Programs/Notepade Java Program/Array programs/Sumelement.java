import java.util.Scanner;
class Sumelement
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of elements of an array:");
		int n=sc.nextInt();
		System.out.println("Enter " + n + " no. of elements");
		int array[];
		array=new int[n];
		
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+array[i];
		}
		System.out.println("Sum=" + sum);
	}
}