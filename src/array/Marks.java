package array;

import java.util.Arrays;

public class Marks {

	public static void main(String[] args) {
		int Ajay_Hindi=78;
		int Ajay_Marathi=80;
		int Ajay_English=90;
		int[] Ajay_Marks= {78,80,90,67,70};
		Arrays.sort(Ajay_Marks);
		String src =Arrays.toString(Ajay_Marks);
		System.out.println(Ajay_Marks[4]);
		int[] arr =new int[2];
		arr[0]=1;
		arr[1]=2;
	//	arr[2]=3;
		int a[][]= {
				{5,10,15,20},
				{10,20,30,40}
		};
		System.out.println(a[0][0]);
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=1;j++) {
				System.out.println(a[j][i]);
			}
		}
	}

}
