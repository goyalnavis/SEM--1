package helloworld;
import java.util.*;
public class A4P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner (System.in);
System.out.print("Enter the number :");
int num=in.nextInt();
int sum=0,n=num;
int i=0; 
while(i<=n) {
	int a=n%10;
	if(a!=0) {
		sum=sum+(a*(int)(Math.pow(10,i)));
		i++;
	}
	n=n/10;
}
System.out.println(sum);
	}

}
