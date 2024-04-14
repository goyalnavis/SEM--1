package helloworld;
import java.util.*;
public class A3P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner (System.in);
System.out.println("Enter the number from:1 to 9");
int b=(int)(Math.random()*10);
int a=in.nextInt();


System.out.println("User number: "+a);
System.out.println("Computer guesses number: "+b);
if (a==b) {
	System.out.println("\"You  got it right\"");
}
int x=a+1;
int y=a-1;
if(b==x || b==y) {
	System.out.println("\"Almost got it\"");
 }
else {
	System.out.println("\"You got it wrong\"");
}
	}

}
