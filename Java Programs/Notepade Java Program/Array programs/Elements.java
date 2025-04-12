import java.util.Scanner;
class Elements
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of elements of an array:");
		int n=sc.nextInt();
		int array[];
		array=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("Given elements is:");
		for(int i=0;i<n;i++)
		{
			System.out.println(array[i]);
		}
	}
}	