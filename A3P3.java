package helloworld;
import java.util.*;
public class A3P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner (System.in);
System.out.println("Enter the first number");
int a=in.nextInt();
System.out.println("Enter the second number");
int b=in.nextInt();
System.out.println("Enter the third number");
int c=in.nextInt();
if (a<b&&a<c)
	System.out.println("\"The number are increasing\"");
else if (a>b&&a>c)
	System.out.println("\"The number are decreasing\"");
else 
	System.out.println("The number is \"Neither Increasing nor decreasing\"");
	}

}
