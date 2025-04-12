import java.util.Scanner;

class College {
    String cname, tname;

    College(String cn, String tn) {
        cname = cn;
    }

    void showdata() {
        System.out.println("Student  Name is: " + cname + "Teacher Name: " + tname);
    }
}

class CollegeOp {
    public static void maion(String ars[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name :");
        String cn = sc.nextLine();
        System.out.println("Enter Teacher Name : ");
        String tn = sc.nextLine();
        College c1 = new College(cn.tn);
        c1.showdata();
    }
}