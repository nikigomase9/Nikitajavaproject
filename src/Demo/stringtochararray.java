package Demo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class stringtochararray {

	public static void main(String[] args) {
	
		int []array1 = new int [6];
		int []array2 = new int [9];
			array1[0]= 3;
			array1[1]= 10;
			array1[2]= 30;
			array1[3]= 45;
			array1[4]= 54;
			array1[5]= 67;
					
			array2[0]= 4;
			array2[1]= 7;
			array2[2]= 12;
			array2[3]= 32;
			array2[4]= 65;
			array2[5]= 76;
			array2[6]= 87;
			array2[8]= 98;
					int pos = 0 ;
			int []array3 = new int [15];
			
			for (int newarray : array1) 
			{  
			array3[pos] = newarray;  
			pos++;             
			}  
			for (int newarray : array2) 
			{  
			array3[pos] = newarray;  
			pos++;  
			}  
			
			Arrays.sort(array3);
			System.out.println(Arrays.toString(array3));    
			 
			}  
	
	
}







			
	
