package Demo;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		
	String name1 = "bac";
	String name2 = "cabmm";
	if (name1.length()!=name2.length()) {
		
		System.out.println("String is not Anagram");
	
	}
	else {
	char c1 []= name1.toCharArray();
	char c2 []= name2.toCharArray();
	Arrays.sort(c1);
	Arrays.sort(c2);
   
	System.out.println(Arrays.toString(c1));

	System.out.println(Arrays.toString(c2));
	
	if(Arrays.equals(c1, c2)) {
		System.out.println("String is Anagram");
		
	}
	else {
		System.out.println("String is not Anagram");
		
	}
	}
		/*
		String name1 = "ram";
		String name2 = "arm ";
		
		if(name1.length()!=name2.length())
		{
			System.out.println("String is not anagram");
		}
		
		else {
			char c1[]= name1.toCharArray();
		    char c2[]=name2.toCharArray();
		    
		    Arrays.sort(c1);
		    Arrays.sort(c2);
		   boolean ans =  Arrays.equals(c1, c2);
		   if(ans== true) {
			   System.out.println("String is Anagram");
		   }
		   else {
			   
			   System.out.println("String is not anagram");
		   }
		}
		*/
				
	}

}
