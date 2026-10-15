package userinput;

import java.util.Scanner;

public class TakeValueFromUser {

	public static void main(String[] args) {
//		datatype var=value(object)
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your withdrawal amount");
		int amount=sc.nextInt();
		
		System.out.println("User withdrawal amount is "+amount);
	}

}
