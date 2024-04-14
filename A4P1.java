package helloworld;
import java.util.*;
public class A4P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.println("Enter the number from which the count is to be started");
int a=in.nextInt();
System.out.println("Enter the number from which the count is to be end");
int b=in.nextInt();
System.out.println("Enter the number from which the count should be increase");
int c=in.nextInt();
int sum = 0;
int i;
System.out.println("The number between "+a+" and "+b+" increase with "+c);
for ( i=a;i<=b;i+=c) {
	
	System.out.print(i+" ");	
	sum+=i;
}

System.out.println("\nThe sum of displayed numbers is from "+a+ " to "+b+" is "+sum);
	}

}
