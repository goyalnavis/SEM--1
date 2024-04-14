package helloworld;
import java.util.*;

public class A5P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner (System.in);
System.out.println("Enter the value of n");
int n=in.nextInt();
int a=0,b=1;
int d=a+b;
System.out.print(a+"\t"+b);
for(int i=3;i<=n;i++) {
	System.out.print("\t"+d);
	a=b;
	b=d;
		d=a+b;
	
}
System.out.println();
	}

}
