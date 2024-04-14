package helloworld;
import java.util.*;
public class A5P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner (System.in);
System.out.print("Enter the value of n: ");
int n=in.nextInt();
double sum=0;
for(int i=1;i<=n;i++) {
	
double a=((double)(1/Math.pow(i,2)));
sum=sum+a;

	
	
	}

System.out.print(sum);
}
	
}