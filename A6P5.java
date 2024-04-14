package helloworld;
import java.util.*;
public class A6P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.print("Enter the number of sides: ");
int n=in.nextInt();
System.out.print("Enter the side length: ");
double s=in.nextDouble();
System.out.println("The area of the polygon is "+area(n,s));
	}
	public static double area(int n, double s) {
		return ((n*s*s)/(4*Math.tan(Math.PI/n)));
	}

}
