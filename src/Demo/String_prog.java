package Demo;

import java.util.Iterator;

public class String_prog {

	public static  void  main(String[]args) {
		
	String city = "Nagpur";
	String city1 = "nagpur";
	String statement = "I live in nagpur";
	String stateoutput = " ";
	
	System.out.println(city.length());
	System.out.println(city.toUpperCase());
	System.out.println(city.charAt(3));
	System.out.println(city.substring(1, 5));
	System.out.println(city.indexOf('r'));
	System.out.println(city.trim());
	System.out.println(city.equals(city1));
	System.out.println(city.equalsIgnoreCase(city1));
	System.out.println(city.concat(" Maharashtra"));

	System.out.println("***********************");
	for (int i = 0 ; i <city.length();i++) {
		System.out.println(city.charAt(i));
	}
	
	System.out.println("***********************");
	for(int j=city.length()-1; j >= 0 ; j--) {
		System.out.println(city.charAt(j));
		
	}
	System.out.println("Reverse the string");
	for (int i = city.length()-1; i >= 0 ; i--) {
		System.out.print(city.charAt(i));
	}
		for (int i = statement.length()-1; i >= 0 ; i--) {
		stateoutput = stateoutput + statement;
				System.out.print(stateoutput.charAt(i));
	}
	
	
	
	}
	
}
