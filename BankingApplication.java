import java.util.Scanner;

class BankAccount {
	
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	BankAccount(String customerName, String customerId) {
		this.customerName = customerName;
		this.customerId = customerId;
	}
	
	void deposit(int amount) {
		if(amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
	void withdraw(int amount) {
		
		if(amount != 0) {
			balance -= amount;
			previousTransaction -= amount;
		}
	}
	
	void getPreviousTransaction() {
		
		if(previousTransaction > 0) {
			
			System.out.println("Deposited: " + previousTransaction);
		}
		else if(previousTransaction < 0) {
			
			System.out.println("Withdrawn: " + Math.abs(previousTransaction));
		}
		else {
			
			System.out.println("No transaction occured");
		}
	}
	
	void showMenu() {
		
		char option = '\0';
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome " + customerName);
		System.out.println("Your ID is " + customerId);
		System.out.println("\n");
		System.out.println("A. Check balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous transaction");
		System.out.println("E. Exit");
		
		do {
			
			System.out.println("======================================");
			System.out.print("Enter an option: ");
			System.out.println("\n======================================");
			option = input.next().charAt(0);
			switch (option) {
			
			case 'A':
				System.out.println("--------------------");
				System.out.println("Balance = " + balance);
				System.out.println("--------------------");
				System.out.println("\n");
				break;
			case 'B':
				System.out.println("--------------------");
				System.out.println("Enter an amount to deposit");
				System.out.println("--------------------");
				int amount = input.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
			case 'C':
				System.out.println("--------------------");
				System.out.println("Enter an amount to withdraw");
				System.out.println("--------------------");
				int amount2 = input.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
			case 'D': 
				System.out.println("--------------------------");
				getPreviousTransaction();
				System.out.println("--------------------------");
				System.out.println("\n");
				break;
				
			case 'E':
				System.out.println("********************************");
				break;
				
		   default:
			   System.out.println("Invalid Option! Please enter again ");
			   break;
				
			}
		}
			while(option != 'E');
			
			System.out.println("Thank you " + customerName +  " "
					+ "for using our services!");
	}
	
	
}
public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter customer's name: ");
		String cName = input.nextLine();
		System.out.print("Enter customer's ID: ");
		String cID = input.nextLine();
		System.out.println();
		BankAccount customer = new BankAccount(cName, cID);
		customer.showMenu();

	}

}
