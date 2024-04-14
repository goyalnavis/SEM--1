package helloworld;
import java.util.*;
public class A3P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner (System.in);
System.out.println("Enter the unit range");
double unit=in.nextDouble();
if (unit<=50) {
	double a=unit*3;
	System.out.println("The price of the first 50 units is :" +a);
}
else if(unit>50&&unit<=200) {
	double b=(50*3)+((unit-50)*4.80);
System.out.println("The price of the range between 50-200 unit is:" +b );
}
else if(unit>200&&unit<=400) {
	double c= (50*3)+(200*4.80)+((unit-200)*5.80);
	System.out.println("The price of the range between 200-400 unit is:" +c );
}
else {
	double d=(50*3)+(200*4.80)+(400*5.80)+((unit-400)*6.20);
	System.out.println("The price of the range above 400 unit is: "+d);
}

	
	}

}
