  package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Map_Interface {

	public static void main(String[] args) {
		Map <String ,String> m1 = new HashMap <String,String>();
		m1.put("Nikita", "QA");
		m1.put("Nihal", "Test Eng");
		m1.put("Shruti", "Devloper");
		m1.put("Geeta", "HR");
		m1.put("poojal", "null");
		
		for(String a1 :m1.keySet()){
			System.out.println(a1);
			
		}
		for(String a2 :m1.values()){
			System.out.println(a2);
			
		}
		
		System.out.println(":::::::::::::::::  ");
		for(Entry<String, String> a3 :m1.entrySet()){
			System.out.println(a3);
			
		}
		
	
		/*Map <String ,String> m2 = new HashMap <String,String>();
		m2.put("Ramesh", "IT");
		m2.putAll(m1);
		System.out.println(m2);
		boolean b =m1.isEmpty();
	  System.out.println(b);
	  
	 // m2.remove("Ramesh");
  // remove("Geeta", "HR");
	  System.out.println(m1);
	  
	  */
		
		
	}

}
