
class Amazon{
	
	private String pass = "Nikita@123";


  public String getpass() {
	  return pass ;
  }
  
  public void setpass(String pass) {
	  this.pass = pass;
  }
}
public class Encapsulations {

	public static void main(String[] args) {
	Amazon a = new Amazon()	;
	a.setpass("nikita@");
	System.out.println(a.getpass());
		
	}

}
