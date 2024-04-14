package helloworld;
import java.util.*;

public class A6P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Enter a String: ");
String s=sc.nextLine();
System.out.print("Enter a character: ");
char ch=sc.next().charAt(0);
System.out.println("The character "+ch+ " in the word "+s+" is: "+count(s,ch));
	}
	public static int count(String str,char a) {
		int count =0;
		for(int i=0;i<str.length();i++) {
			if (str.charAt(i)==a)
		count++;
	}
		return count;
	}

}
