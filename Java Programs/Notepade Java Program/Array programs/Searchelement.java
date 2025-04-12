import java.util.Scanner;
class Searchelement
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of elements of an array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		int i;
		System.out.println("Enter" + n + "elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter search element:");
		int se=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(se==a[i])
			{
				System.out.println(se + " is found at position " + (i+1));
				break;
			}
		}
	}
}