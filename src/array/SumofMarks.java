package array;

public class SumofMarks {

	public static void main(String[] args) {
		String name[]= {"Kunal","Vignesh","Aditya","Preets"};
		int marks[][]= {
				{45,60,70,80,90},
				{55,65,75,85,95},
				{63,45,79,60,57},
				{78,77,67,97,49}
		};
		for(int i=0;i<=3;i++) {
			int sum=0;
			for(int j=0;j<=4;j++) {
				sum=sum+marks[i][j];
			}
			System.out.println(name[i]+" total marks is "+sum+"/500");
			System.out.println(name[i]+" percentage is "+((double)sum/5));
		}
	}

}
