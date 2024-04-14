package helloworld;
import java.util.*;
public class A4P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.println("Enter the number to check whethetr it is divisible by 9 or not");
int num=in.nextInt();
int num1=num;
int sum=0;
while(num!=0) {
	int a=num%10;
	sum+=a;
	num/=10;
}
if (sum%9==0) {
	System.out.println("The number "+num1+" is divisible by 9");
}
else {
	System.out.println("The number "+num1+" is not divisible by 9");
}
	}

}
