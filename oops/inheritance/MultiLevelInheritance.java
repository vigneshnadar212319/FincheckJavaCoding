package inheritance;

import java.util.Iterator;

class Balance{
	public int getbalance(int balance) {
		return balance;
		
	}
}
class CheckBalance extends Balance{
	public void Validate(int balance[],String name[],String ACCId[]) {
		for(int i=0;i<name.length;i++) {
			if (name[i].equals("Vignesh")&&ACCId[i].equals("101")) {
				System.out.println(getbalance(balance[i]));
				return;
			}
		
		System.err.println("No account has been found");
	
		}
	}
}
class Atm extends CheckBalance{
	
}
class fincheck extends CheckBalance{
	
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		String[] AccId= {"101","102","103"};
		String name[]= {"Vignesh","Hardik","Pritam"};
		int[] balance= {30000,18000,150};
		fincheck fn=new fincheck();
		fn.Validate(balance, name, AccId);
		}

}
