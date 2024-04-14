package helloworld;
import java.util.*;
public class H1P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner("System.in");
	
System.out.println("Enter an integer:");
int num = in.nextInt();

boolean divisibleBy5And6 = (num % 5 == 0) && (num % 6 == 0);
boolean divisibleBy5Or6 = (num % 5 == 0) || (num % 6 == 0);
boolean divisibleBy5Xor6 = (num % 5 == 0) ^ (num % 6 == 0);

System.out.println(num + " is divisible by 5 and 6: " + divisibleBy5And6);
System.out.println(num + " is divisible by 5 or 6: " + divisibleBy5Or6);
System.out.println(num + " is divisible by 5 or 6, but not both: " + divisibleBy5Xor6);
	}
	
}
