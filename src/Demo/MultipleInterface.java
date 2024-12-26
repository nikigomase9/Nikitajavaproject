package Demo;

interface A {
	void add ();
	void sub();
	
}
interface B {
	void divide ();
	void mul();
	
}

public class MultipleInterface implements A ,B {

	public static void main(String[] args) {
		MultipleInterface I = new MultipleInterface();
		I.add();
		I.mul();
		I.sub();
		I.divide();

	}

	
	public void divide() {
		System.out.println("I am divide method");
		
	}

	public void mul() {
		System.out.println("I am multiply method");
		
	}

	public void add() {
		System.out.println("I am add method");
		
	}


	public void sub() {
		System.out.println("I am subtract method");
		
	}

}
