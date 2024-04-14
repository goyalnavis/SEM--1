package helloworld;
import java.util.*;
public class A3P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner (System.in);
System.out.println("Enter the 3 number ");
int a=in.nextInt();
int b=in.nextInt();
int c=in.nextInt();
if (a>b && a<c) {
	System.out.println("The largest number is "+a);
}
else if (b>c) {
	System.out.println("The largest number is "+b);
}
else  {
	System.out.println("The largest number is "+c);
}
if (a>b && a>c) {
	System.out.println("The second largest number is "+a);
}
else if ( b<c) {
	System.out.println("The second largrst number is "+b);
}
else {
	System.out.println("The second largest number is "+c);
}
	}

}
