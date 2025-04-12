import java.util.Scanner;
class Collage
{
	String cname,city;
	void setcname(String cn)
	{
		cname=cn;
	}
	
	void setcity(String ct)
	{
		city=ct;
	}
}

class Department extends Collage
{
	String dep;
	void setdep(String de)
	{
		dep=de;
	}
}

class Teacher extends Department
{
	String tname;
	void settname(String tn)
	{
		tname=tn;
	}
	
	void showdata()
	{
		System.out.println("\nCollage Name: " + cname + "\nCity: " + city + "\nDepartment Name: " + 		dep + "\nTeacher Name: " +tname);
	}
}

class CollageOp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Collage Name :");
		String cn=sc.nextLine();
		
		System.out.println("Enter City:");
		String ct=sc.nextLine();
	
		System.out.println("Enter Department Name:");
		String dep=sc.nextLine();
		
		System.out.println("Enter Teacher Name:");
		String tn=sc.nextLine();

		System.out.println("Given Data is :");
		Teacher t=new Teacher();
		t.setcname(cn);
		t.setcity(ct);
		t.setdep(dep);
		t.settname(tn);
		t.showdata();
	}
}