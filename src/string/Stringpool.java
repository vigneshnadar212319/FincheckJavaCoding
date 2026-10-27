package string;

import java.util.Scanner;

public class Stringpool {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a token:");
		String token=sc.next();
		
		String str="hello";
		String str1="hello";
		
		String str3=new String("hello");
		System.out.println(str3);
		
		if(str== token) {
			System.out.println("both are from same pool");
			
		}
		else {
			System.out.println("both are not from same pool");
		}
	}

}
