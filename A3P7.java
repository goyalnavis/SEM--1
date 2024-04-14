package helloworld;
import java.util.*;
public class A3P7 {

	

	public static void main(String[] args) {
	 	// TODO Auto-generated method stub
Scanner in=new Scanner (System.in);
double bill = 0;
System.out.println("Enter the unit range");
int unit=in.nextInt();
if (unit<=50) {
	 bill=unit*3;
	System.out.println("The price of the first 50 units is :" +bill);
}
else if(unit>50&&unit<=200) {
	 bill=(50*3)+((unit-50)*4.80);
System.out.println("The price of the range between 50-200 unit is:" +bill );
}
else if(unit>200&&unit<=400) {
	 bill= (50*3)+(200*4.80)+((unit-200)*5.80);
	System.out.println("The price of the range between 200-400 unit is:" +bill);
}
else {
	 bill=(50*3)+(200*4.80)+(400*5.80)+((unit-400)*6.20);
	System.out.println("The price of the range above 400 unit is: "+bill);
}
System.out.println ("Do you want to pay the bill online?");
String option = in.next();
int n = 0;
if (option.equalsIgnoreCase("Yes"))
{
	n = 1;
}
else 
{
	n = 2;
}
switch (n)
{
case 1:
	double discount = 0.3*bill;
	bill -= discount;
	System.out.println ("Your bill is: "+ bill);
	break;
	
case 2:
	System.out.println ("Your bill is: "+bill);
	break;
	default:
		System.out.println ("Code leak");
}
	}

}
