package activities;

import java.util.Scanner;

public class Active {

	public static void main(String[] args) {
		String Account="Active";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your account status");
		String status=sc.next();
		if (status.equals("Active")) {
			System.out.println("The account is active");
			
		} else {
			System.err.println("Not active");

		}
	}

}
