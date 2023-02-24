package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class BankOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		Account account;
		
		System.out.println("Enter Account Number:");
		int number = sc.nextInt();
		
		System.out.println("Enter Account Holder:");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println ("Is there a initial deposit?(y/n)");
		char response = sc.next().charAt(0);
			if (response == 'y') {
				System.out.println("Enter initial deposit value:");
				double initialDeposit = sc.nextDouble();
				account = new Account(number, holder, initialDeposit);
			}
			else {
				account = new Account(number, holder);
			}
			
			
			System.out.println();
			System.out.println("Account Data:");
			System.out.println(account);
			
			System.out.println();
			System.out.println("Enter the deposit data:");
			double depositValue = sc.nextDouble();
			account.deposit(depositValue);
			System.out.println("Updated Account data:");
			System.out.println(account);
			
			System.out.println();
			System.out.println("Enter the withdraw value:");
			double withdrawValue = sc.nextDouble();
			account.withdraw(withdrawValue);
			System.out.println(account);
			
		sc.close();
	}

}
