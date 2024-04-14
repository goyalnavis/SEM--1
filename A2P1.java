package helloworld;
import java.util.*;
public class A2P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the value in fahrenheit");
		double f = sc.nextDouble();
		double c = (f-32)*(5.0/9);
		System.out.println("value in celsius = "+c);

	}

}