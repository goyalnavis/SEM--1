package helloworld;
import java.util.*;
public class A2P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner (System.in);
		System.out.println("Enter the Basic Salary");
		int salary = in.nextInt();
		double da = salary*0.4;
		double hra = salary*0.2;
		System.out.println("Dearness Allowance is ="+da);
		System.out.println("House rent Allowance is ="+hra);
		double GS = salary+da+hra;
		System.out.println("Gross Salary is ="+GS);
	}

}
