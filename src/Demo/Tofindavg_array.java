package Demo;

public class Tofindavg_array {

	public static void main(String[] args) {
		int values []= new int [4];
		values[0]= 1;
		values[1]= 2;
		values[2]= 3;
		values[3]= 4;
		int sum = 0 ;
		for (int i = 0;i<values.length;i++) {
			sum = sum + values[i];
		}
System.out.println(sum);
int avg = sum/values.length;
System.out.println(avg);

}
}