package Demo;

import java.util.Scanner;

public class String_matches {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner (System.in);
		System.out.println("Enter string ");
		
		
	String name = s1.next();
		System.out.println(name.matches("R(.*)"));// checks string starts from r or not 
		
		System.out.println(name.matches("..... "));// checks given string has 5 chars or not 
		
		System.out.println(name.matches("(.*)m"));//checks string ends with m or not .
		
		System.out.println(name.matches("(.*)m(.*)"));
		
	}

}
