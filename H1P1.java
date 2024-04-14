package helloworld;
import java.util.*;
public class H1P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner (System.in);
int s=1,n = 0;
while  (s>0)
{
System.out.println("Enter the value");
 n=in.nextInt();
 if  (n>=100)
 {
	 n=n+2;
	 break;
 }
 else
 {
	 System.out.println("Invalid number,try again");
	s++;
 }
}
System.out.println(n);
	}

}
