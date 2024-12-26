package Demo;

import java.util.Arrays;

public class remove_spacefromstring {

	public static void main(String[] args) {
		
		String name =  "Nikita Gomase";
	
		System.out.println(name.replace('N', 'R'));;
		
		String s = "Nikita Nihal Raghorte";
		System.out.println(s.replace(" ", ""));
		
		String w = "Avinash Yadav";
		System.out.println(w.replaceAll("[A-Z]", ""));
		System.out.println(w.replaceAll("[a-z]", ""));
		
		String text = "Bangalore no 1 ";
		System.out.println(text.replaceAll("[0-9]", ""));
		System.out.println(text.contains("no"));
		
		String [] n = s.split(" ");
		System.out.println(Arrays.toString(n));
		String[] m = s.split(" ", 2);
		System.out.println(Arrays.toString(m)); 

	}
 
}
