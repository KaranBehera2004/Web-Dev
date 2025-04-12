import java.util.Scanner;

class Home {
    String fname, adderess, mname;
    int age, pin;

    void setfname(String fn) {
        fname = fn;
    }

    void setadderss(String ad) {
        adderess = ad;
    }

    void setmname(String mn) {
        mname = mn;
    }

    void setage(int ag) {
        age = ag;
    }

    void setpin(int pi) {
        pin = pi;
    }
}

class Son1 extends Home {
    String s1name;

    void sets1name(String s1n) {
        s1name = s1n;
    }

}

class Son2 extends Son1 {
    String s2name;

    void sets2n(String s2n) {
        s2name = s2n;
    }

    void showdata() {
        System.out.println("\nFather Name is: " + fname + "\nMother Name is: " + mname + "1st Son name :" + s1name
                + "2nd Son Name : " + s2name + "\nAdderess: " + adderess
                + "\nAge : " + age + "\nPin: " + pin);
    }
}

class HomeOp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your father name:");
        String fname = sc.nextLine();

        System.out.println("Enter your mother name:");
        String mname = sc.nextLine();

        System.out.println("Enter your father adderess:");
        String ad = sc.nextLine();

        System.out.println("Enter your pin code:");
        int pin = sc.nextInt();

        System.out.println("Enter your 1st son name:");
        String s1n = sc.nextLine();

        System.out.println("Ente ryour 2nd son name:");
        String s2n = sc.nextLine();

        Son2 s2 = new Son2();
        s2.setfname(fname);
        s2.setmname(mname);
        s2.setadderss(ad);
        s2.setpin(pin);
        s2.sets1name(s1n);
        s2.sets2n(s2n);
        s2.showdata();
    }
}