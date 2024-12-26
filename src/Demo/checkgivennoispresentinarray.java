package Demo;

import java.util.Arrays;

public class checkgivennoispresentinarray {

	public static void main(String[] args) {
		int value [] = new int[4];
		value[0]= 23;
		value[1]= 45;
		value[2]= 32;
		value[3]= 28;
		
		
		int givenno= 766; 
		
		for (int i = 0 ; i<value.length;i++) {
			 if(givenno ==value[i]) {
				 
				 System.out.println("Given no is part of array "+ "at index position: "+i);
				 
			 }
			 else {
				 System.out.println("Not found");
				 
				 
			 }
		}
		
	}

}
