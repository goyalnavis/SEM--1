package helloworld;
import java.util.*;
public class A3P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
boolean result;
System.out.println("Enter the year");
int year =in.nextInt();
if ((year %4==0)&& (!(year%100 <= 0)) || (year % 400 == 0))  
{
	result = true;
}
else
{
	result = false;
}
System.out.println (year + " is a leap year: "+result);
	}

}
