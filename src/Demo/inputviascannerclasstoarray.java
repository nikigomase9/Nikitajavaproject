
 package Demo;
import java.util.Arrays;
import java.util.Scanner;
public class inputviascannerclasstoarray {

	public static void main(String[] args) {
		
		
		String [] names = new String[4];
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter input please :");
		
		for (int j=0;j<names.length;j++) {
			names[j]= s.next();
			
		}
		s.close();
		System.out.println(Arrays.toString(names));
		
		/*int[] rollno = new int [4];
		Scanner s1 = new Scanner(System.in);
		 
		System.out.println("Enter input please");
		 for(int i = 0 ;i<rollno.length;i++) {
			 rollno[i]  =  s1.nextInt();
			 
		 }
		 s1.close();
		 System.out.println(Arrays.toString(rollno));
	}
*/
}
}
