package Demo;

import java.util.Arrays;

public class Array_copy {
	
	public static void main(String[]args) {
		
		double Esalary []= new double[4];
		Esalary[0] = 37000;
		Esalary [1] = 45000;
		Esalary[2] = 55000;
		
		System.out.println("Old array"+Arrays.toString(Esalary));
		double  Msalary []= new double [4];
		for(int i = 0 ; i<Esalary.length;i++) {
			
		Msalary[i]= Esalary[i];
		}
		System.out.println("After copying array");
		System.out.println(Arrays.toString(Esalary));
		
	}

}
