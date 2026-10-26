package activities;

public class Activity3 {

	public static void main(String[] args) {
		String acc_status="Active";
		String transaction_type="debit";
		if (acc_status.equals("Active")) {
			if (transaction_type.equalsIgnoreCase("Debit")) {
				System.out.println("Debit transaction is valid");
				
			} else {System.out.println("Invalid Transaction Type");

			}
			
		} else {
			System.out.println("Account is not active");

		}
	}

}
