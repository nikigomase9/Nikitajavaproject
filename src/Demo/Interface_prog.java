package Demo;

interface demo {
	
	void add();
	void mul();
 
}

public class Interface_prog  implements demo  {

	
	
	public void add() {
		System.out.println("I am add method ");
			
		}

		
		public void mul() {
			System.out.println("I am multiply method");
			
		}
	public static void main(String[] args) {
		Interface_prog n = new Interface_prog();
		n.add();
		n.mul(); 

	}

	
	

}
