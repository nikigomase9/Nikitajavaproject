package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class upcasting {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("Nikita");
		c.add(5);
		System.out.println(c);
		Collection c1 = new ArrayList();
		c1.add(c);
		c1.add(3.2);
		System.out.println(c1);
		System.out.println(c1.contains(3.2));
		System.out.println(c1.containsAll(c));
	
		c1.add(3);
		c1.add(8);
		c1.add(3);
		c1.add(4);
		c1.add(null);
		System.out.println(c1);
		c1.removeAll(c);
		System.out.println(c1);
		c.clear();
		System.out.println(c);
		System.out.println(c1);
	boolean b = 	c.isEmpty();
	System.out.println(b);
	}

}
