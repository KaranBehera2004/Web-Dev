import java.util.Scanner;

class ATM {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int balance = 10000;

		do {
			System.out.println("	  \n\n\nWelcome to ATM");
			System.out.println(" Choose 1 for Withdraw:");
			System.out.println(" Choose 2 for Deposit:");
			System.out.println(" Choose 3 for Check Balance:");
			System.out.println(" Choose 4 for Exit:");

			System.out.println("Enter your choice :");
			int choice = sc.nextInt();

			switch (choice) {
				case 1:
					System.out.println("Enter withdraw amount:");
					int wtd = sc.nextInt();
					if (balance >= wtd) {
						balance = balance - wtd;
					} else {
						System.out.println("Insufficent Balance!!!...");
						break;
					}
					System.out.println("Please collect your money..");
					System.out.println("\nThank You ...... Visit again");
					break;
				case 2:
					System.out.println("Enter deposit amount:");
					int dep = sc.nextInt();
					balance = balance + dep;
					System.out.println("your amount has been successfully deposited.");
					break;
				case 3:
					System.out.println("Your current amount is " + balance);
					break;
				case 4:
					System.out.println("Thank You....");
					System.exit(0);
				default:
					System.out.println("Invalid Choose!!!....");
			}
		} while (true);
	}
}