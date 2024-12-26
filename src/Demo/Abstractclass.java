package Demo;

abstract class Amazon{//abstract class 
	abstract void login();//abstract method 
	abstract void registration();//abstract method
	
}
//exposing to third party
public class Abstractclass extends Amazon {
	
	void login() {
		 System.out.println("I am login method");
		
	}

	
	void registration() {
		System.out.println("I am registrtaion method ");		
	}
	
	static void logout() {
		System.out.println("logout  method");
	}
	
	static void resetpassword() {
		 
		
	}

	public static void main(String[] args) {
		
		Abstractclass a =  new Abstractclass();
		a.login();
		a.registration();
		Abstractclass.logout();
		
	}


	

}
