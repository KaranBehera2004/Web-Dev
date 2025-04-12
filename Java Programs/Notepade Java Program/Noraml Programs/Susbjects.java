import java.util.Scanner;
class Subjects
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 subject marks of the student:");
		int marks[];
		marks=new int[5];
		for(int i=0;i<5;i++)
		{
			marks[i]=sc.nextInt();
		}
		
		System.out.println("Given marks is:");
		for(int i=0;i<5;i++)
		{
			System.out.println(marks[i]);
		}
	}
}	