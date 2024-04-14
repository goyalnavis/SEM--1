package helloworld;
import java.util.*;
public class A2P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
System.out.println("Enter the radius of the Hemisphere");
double radius =in.nextDouble();
double sa = 3*Math.PI*Math.pow(radius,2);
double vol = (2.0/3)*Math.PI*Math.pow(radius,3);
System.out.println("The surface area of the Hemisphere ="+sa);
System.out.println("The volume of the Hemisphere ="+vol);
	}

}
