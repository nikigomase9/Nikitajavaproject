
class upperclass {
void sub() {
	
}
}
public class Classtype_casting extends upperclass
{
void add() {
	
}
public static void main (String[]args) {
    upperclass	a1 =  new Classtype_casting();           // implicite way of upcasting
	upperclass	a2 = (upperclass) new Classtype_casting();//explicite 
	
	Classtype_casting a3 = (Classtype_casting)a2;//downcasting explicite
	a3.add();
	a3.sub();
}


}
