package dynamicmoneyhandling;

import java.util.Scanner;

public class Validatetransactionsamount {

	public static void main(String[] args) {
		int balance=100000;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Withdrawal Amount:");
		int withdrawal=sc.nextInt();
		
		if (withdrawal > 0) {
			
		
			
			if (balance>withdrawal) {
				System.out.println("Transaction sucessful");
				
			}
			else {
				System.err.println("Transaction Failed ");
			}	
			
		}
		else {System.err.println("Enter a valid withdrawal amount");
			
		}
		
	}

}
