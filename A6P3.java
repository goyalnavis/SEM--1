package helloworld;
import java.util.*;
public class A6P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.print("Enter an integer: ");
int n=in.nextInt();
System.out.println(n+" "+(isPalindrone(n)?"is":"is not")+" a palindrone number");
	}
	public static int reverse(int number) {
		int rev =0;
		while(number>0) {
			int r=number%10;
			rev=rev*10+r;
			number/=10;
			
		}
		System.out.println(rev);
		return rev;
		
	}
	public static boolean isPalindrone(int number) {
		if(number==reverse(number))
			return true;
		else
			return false;
	}

}
