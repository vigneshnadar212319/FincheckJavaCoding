package looping;

import java.util.Scanner;

public class Atmloop {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your card number");
		long cn=sc.nextLong();
		if (cn==1122334455l) {
			for (int i=1;i<=3;i++) {
			System.out.println("Enter your pin");
			int pin=sc.nextInt();
			if (pin==1234) {
				int balance=50000;
				System.out.println("Menus \n1.Deposit\n2.Withdrawals\n3.Check Balance\n4.Exit");
				int menu=sc.nextInt();
				switch (menu) {
				case 1:
					System.out.println("Enter your Deposit amount");
					int amount=sc.nextInt();
					if (amount>0) {
						balance=balance+amount;
						System.out.println("Your current balance is " +balance);
						
					} else {
						System.out.println("Invalid deposit amount");
				
					}
					break;
				case 2:
					System.out.println("Enter you withdrawal amount");
					amount=sc.nextInt();
					if (amount>0) {
						balance=balance -amount;
						System.out.println("Your current update balance is "+balance);
						
					}
					else {
						System.out.println("Invalid deposit amount");
					}
					break;
					default:
						System.out.println("Invalid menu options");
						break;
				}
				break;
						
			}else {
				System.err.println("Incorrect pin");
			}
			
			
			}			
		}else {
			System.out.println("Your card not found");
		}
				
		
	
	}

}
