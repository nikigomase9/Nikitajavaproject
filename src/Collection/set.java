package Collection;
import java.util.Iterator;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class set {

	public static void main(String[] args) {
		Set s1 = new HashSet();
		s1.add(46);
		s1.add(98);
		s1.add(60);
		s1.add(4);
		s1.add(87);
		//s1.add(null);
		System.out.println(s1 );

		
		Iterator it = s1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
