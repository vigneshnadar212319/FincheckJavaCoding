package conditionalstatement;

public class TransactionValidation {

	public static void main(String[] args) {
		int balance=50000;
		int withdrawal=35000;
		
		if (balance>withdrawal) {
			System.out.println("Transaction sucessful");
			
			
		}
		else {
			System.out.println("Enter Valid amount");
		}
		
	}

}
