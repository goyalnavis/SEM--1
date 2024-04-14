package helloworld;
import java.util.*;

public class A6P1 {

	public static int addition(int x, int y) {
		return x+y;
	}
	public static int subtractionSimple(int x, int y) {
		return y-x;
	}
	public static int multiplicationSimple(int x, int y) {
		return y*x;
	}
	public static double divisionSimple(int x, int y) {
		return y/x;
	}
	public static int reminderSimple(int n, int m) {
		return n%m;
	}
	public static double squareRootSimple(int n) {
		return Math.sqrt(n);
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a=sc.nextInt();
		System.out.print("Enter the second number: ");
		int b=sc.nextInt();
		System.out.print("Enter the operator (for sqrt type \'r\'): ");
		sc.nextLine();
		char ch=sc.nextLine().charAt(0);
		switch (ch){
		case '+': System.out.println("Addition of "+a+" and "+b+" is "+addition(a,b));
		break;
		case '-': System.out.println("Subtraction of "+b+" and "+a+" is "+subtractionSimple(a,b));
		break;
		case '*': System.out.println("Multiplication of "+a+" and "+b+" is "+ multiplicationSimple(a,b));
		break;
		case '/': if(a==0)
			System.out.println("Invalid");
		else 
			System.out.println("Division of "+b+" by "+a+" is "+divisionSimple(a,b));
		break;
		case '%': if ((a==0)|| (b==0))
			System.out.println("Invalid");
		else 
			System.out.println("Reminder of "+b+" by "+a+" is "+reminderSimple(a,b));
		break;
		case 'r' : if (a>=0)
			System.out.println("Square root of "+a+" is "+squareRootSimple(a));
		else 
			System.out.println("Invalid");
		break;
		
		}
		
		}
	}

	


