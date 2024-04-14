package helloworld;
import java.util.*;
public class H1P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.println("Enter 0 to 6 :for Sunday to Monday: to dispay today ");
int today=in.nextInt();
System.out.println("Enter the number of days elapsed since today");
int ep =in.nextInt();
int future=(today+ep)%7;
System.out.println("Today is");
switch(today){
case 0:
	System.out.println("Sunday");
	break;
case 1:
	System.out.println("Monday");
	break;
case 2:
	System.out.println("Tuesday");
	break;
case 3:
	System.out.println("Wednesday");
	break;
case 4:
	System.out.println("Thusday");
	break;
case 5:
	System.out.println("Friday");
	break;
case 6:
	System.out.println("Saturday");
	break;
}
System.out.println("The future day");
switch(future) {
case 0:
	System.out.println("Sunday");
	break;
case 1:
	System.out.println("Monday");
	break;
case 2:
	System.out.println("Tuesday");
	break;
case 3:
	System.out.println("Wednesday");
	break;
case 4:
	System.out.println("Thursday");
	break;
case 5:
	System.out.println("Friday");
	break;
case 6:
	System.out.println("Saturday");
	break;
}


	}

}
