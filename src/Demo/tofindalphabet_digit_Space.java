package Demo;

import java.util.Arrays;
import java.util.Scanner;

public class tofindalphabet_digit_Space {

	static int count_Alaphabet ;
	static int count_Digit ;
	static int count_Space ;
	public static void main(String[] args) {
    //Scanner s1 = new Scanner(System.in);
    //System.out.println("Please Enter the string");
    String Input = "Mumbai is no 1345  @#";
    
    
  char[] c1 = Input.toCharArray();
  System.out.println(Arrays.toString(c1));
  
  for (int i = 0 ; i<Input.length();i++) {
	boolean ans1 =  Character.isAlphabetic(c1[i]);
	  
	if (ans1 == true ) {
     count_Alaphabet++;		
	}
 

  
		boolean ans2 =  Character.isDigit(c1[i]);
  
		  
		if (ans2 == true ) {
	     count_Digit++;		
		}
  
	
  
	
		boolean ans3 =  Character.isSpaceChar(c1[i]);
		  
		if (ans3 == true ) {
	     count_Space++;		
		}		


  }
 int  specialchar = Input.length() - (count_Alaphabet+count_Digit+count_Space);
 System.out.println("No of alphabets:"+ count_Alaphabet);
 System.out.println("No of Digits :"+ count_Digit);

 
 System.out.println("No of spaces :"+count_Space);	
 System.out.println(specialchar);
	}
}
	
