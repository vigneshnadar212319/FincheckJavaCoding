package inheritance;

import java.util.Scanner;

class Amountcalc{
	public void deposit(int amount ,int balance){
		if (amount>0) {
			balance =balance+ amount;
			System.out.println("Amount has been deposited\nYour current balance is:"+balance);
			
		}
		else{
			System.err.println("Enter Valid Amount");
		}
	}
}

class ATM extends Amountcalc{
	
} 
public class Singleinheritance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your deposit amount");
		int amount=sc.nextInt();
		ATM a=new ATM();
		a.deposit(amount, 500);
	}

}
