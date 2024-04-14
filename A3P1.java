package helloworld;
import java.util.*;
public class A3P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner (System.in);
System.out.println("enter your age");
int age=in.nextInt();
if (age>=18)
	System.out.println("you are eligible to cast the vote:" +age);
else 
	System.out.println("you are not eligible to cast the vote");
	}

}
