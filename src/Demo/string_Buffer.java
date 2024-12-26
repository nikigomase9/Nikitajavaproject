package Demo;

public class string_Buffer {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Selenium");
	
	System.out.println(s1.reverse());
		System.out.println(s1.delete(0, 2));
		//System.out.println(s1.insert(0, "Te"));
		//System.out.println(s1.append("Testing"));
		
		StringBuffer s2 = new StringBuffer("API Testing");
		System.out.println(s2.replace(0, 3, "Manual"));

	}
}