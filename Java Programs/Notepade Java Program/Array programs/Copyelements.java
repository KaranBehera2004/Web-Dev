import java.util.Scanner;
class Copyelements
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of elements of an array:");
		int n=sc.nextInt();
		int b[]=new int[n];
		int j,i;
		int a[]=new int[n];
		System.out.println("Enter" + n + "elements");
		for( i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Copy of elemets");
		for(j=0,i=0;i<n;i++,j++)
		{
			b[j]=a[i];
		}
		for( j=0;j<n;j++)
		{
			System.out.print(b[j] + "\t");
		}
	}
}q