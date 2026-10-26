package activities;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int balance=5000;
		System.out.println("Enter account status");
		String acc_status=sc.next();
		if (acc_status.equals("Active")){
			System.out.println("Enter withdrawal amount");
			int withdrawal=sc.nextInt();
			if (balance>withdrawal && withdrawal>0) {
				balance-= withdrawal;
				System.out.println("The Available balance is "+balance);
				
			} else {
				System.err.println("Enter Valid Amount");

			}
		} else {
			System.err.println("Account is Deactive");
			
			

		}
		
	}

}
