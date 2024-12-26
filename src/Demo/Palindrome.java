package Demo;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string :");
		String name = sc.next();
		String output = "";
		
		for (int i = name.length()-1;i>=0;i--) {
			char c= name.charAt(i);
			output = output +c ;
		
		}

		System.out.println(name.length());
		System.out.println(output);
		
		if (output.equals(name)) {
			System.out.println("String is palindrome");
		}
		
		else {
			System.out.println("String is  not palindrome");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	Scanner s1= new Scanner(System.in);
     		
     
     System.out.println("Enter name :");
     String name=  s1.next();
	String output = "";
		
		for (int i = name.length()-1;i>=0;i-- ) {
		char c1=   name.charAt(i);
		
		output = output + c1;
		}
		System.out.println("Reverse the string :"+output);
		System.out.println(output.length());
		System.out.println(name.length());
		
		if (name.equals(output)) {
			
			
			System.out.print("String is palindrome ");
		}
			
			else {
				
				System.out.println("String is  not palindrome");
			}
		}
		
	*/
	}
		}
		
		
		
