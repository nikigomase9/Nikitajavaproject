package Demo;

import java.util.Arrays;
import java.util.Iterator;

public class reversthearray {

	public static void main(String[] args) { 
		
		String name = "nikita" ;
		String output = " ";
		
		for (int i = name.length()-1;i>=0;i--) {
			
			char c1 = name.charAt(i);
			output = output+c1;
		}
		System.out.println(output);
		
	String[] names = new String [3]; 
	names[0]= "Nikita";
	names[1]= "Nihal";
	names[2]= "Raghorte";
	
	String reverse[] = new String[3];
	
	
	for(int i =0,k=2;i<names.length;i++,k-- ) {
		reverse[k]= names[i];
	
	}
	
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(reverse));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		int[] value = new int [4];
		value[0] =2;
 		value[1]= 4;
		value[2]= 6;
		value[3]= 8;
		int reversevalue []= new int[4];
		
		/*logic 
		reversevalue[3]= value[0];
		reversevalue[2]= value[1];
		reversevalue[1]= value[2];
		reversevalue[0]= value[3];
		
		
		System.out.println(Arrays.toString(value));
		for(int i = 0,k =3; i<value.length;i++,k--) {
			reversevalue[k] = value[i];
			
	}
		System.out.println(Arrays.toString(reversevalue));
	}

*/
	}
}

