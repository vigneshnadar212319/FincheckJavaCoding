package objectandclass;

public class VariableandMethod {
	int b=111; //global or class
	public void add() {
		int a=10,b=10;
		System.out.println(a+this.b);
		
	}
	public void sub(int a,int b) {
		System.out.println(a-b);
	}
	public int multi(int a) {
		int b=40;
		return a*b;
	}

	public static void main(String[] args) {
		VariableandMethod va= new VariableandMethod();
		va.add();
		va.sub(12, 12);
		System.out.println(va.multi(30));
		System.out.println(va.b);
		
		
	}

}
