package Demo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Array_prog {
	
	public static void main (String[]args ) {
		
		/* int roll_no[] = new int [4];
		 roll_no[0]= 30;
		 roll_no[1]= 31;
		 roll_no[2]= 45;
		 roll_no[3]= 22;
		
		 System.out.println(Arrays.toString(roll_no));
	Scanner s= new Scanner(System.in);
	System.out.println("Enter number:");
		 int numbertocheck = s.nextInt();
		 for(int i = 0 ;i<=roll_no.length-1;i++)
		 {
	
		 if ( numbertocheck==roll_no[i])
       {
			 System.out.println(numbertocheck  +" is present at index in given array  "+ i);
		 }
		 
		 }
		
		*/ 
		 int numbers[] = new int [4];
		 numbers[0]= 37;
		 numbers[1]=38;
		 numbers[2]= 37;
		 numbers[3]= 22;
		 for(int i = 0 ;i<=numbers.length-1;i++)
		 {
			  for(int k = i+1 ;k<=numbers.length-1;k++) {
				  
			  if(numbers[i]==numbers[k]) {
				  System.out.println("Duplicate exists and number is  "+numbers[i]);
		 }
			  
		 }
		 }
			  
		 
	}
}
	





