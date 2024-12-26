package Demo;

import java.util.Arrays;

public class twoarray_equalornot {

	public static void main(String[] args) {
		int [] roll_no = new int [4];
		roll_no[0]=9;
		roll_no[1]=5;
		roll_no[2]=3;
		roll_no[3]=2;
	
		int [] roll_no1 = new int [4];
		
		roll_no1[0]=9;
		roll_no1[1]=5;
		roll_no1[2]=3;
		roll_no1[3]=2;
		
	boolean ans	= Arrays.equals(roll_no, roll_no1);
	
	System.out.println(ans);
	if (ans==true) {
		System.out.println("Two arryas are equal ");
	}
	else {
		System.out.println("Arrayes are not equal");
		
		}
	}

}
