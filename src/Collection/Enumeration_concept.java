package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Enumeration_concept {

	public static void main(String[] args) {
		
		Vector a = new Vector();
		a.add(4);
		a.add(3);
		a.add(7);
		a.add(8);
		a.add(40);
		a.add(45);
		a.add(54);
		a.add(4);
		
		System.out.println(a);
	 ListIterator L = a.listIterator();
	 while (L.hasNext()) {
		
		System.out.println(L.next());
	}
	 while (L.hasPrevious()) {
			
			System.out.println(L.previous());
		}
		
		System.out.println("Enumeration");
		
		Enumeration e = a.elements();
		while(e.hasMoreElements()) {
			
			System.out.println(e.nextElement());
		}
	
	
	}
	}
