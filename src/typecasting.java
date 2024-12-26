
public class typecasting {

	public static void main(String[] args) {
		//convert int to double 
		
		int a = 10 ;
		  double d= a;
		  System.out.println(d);//impilicite way 
	
	//convert int to double 
	
	 int a1 = 10 ;
	 double d1 = (double) a1;//explicite 
	 
	 System.out.println(d1);
	 
	 //convert double to int 
	 double  a2 = 10.5;
	  int a3 = (int)a2;//Narrowing  
	  System.out.println(a3);
	 
	  //covert int into byte 
	  int a4 = 20 ;
	  byte a5 =( byte)a4;
	  System.out.println(a5);
	  
	  
			 }
}