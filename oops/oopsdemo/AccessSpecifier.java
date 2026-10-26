package oopsdemo;

public class AccessSpecifier {
	public long Account_number=6352315l;
	protected int balance=12000;
	private int pin=1123;
	String name="Vignesh";

	public static void main(String[] args) {
		AccessSpecifier a=new AccessSpecifier();
		System.out.println(a.Account_number);
		System.out.println(a.balance);
		System.out.println(a.pin);
		System.out.println(a.name);
	}

}
