package helloworld;
import java.util.Scanner;
public class A6P8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s=sc.nextLine();
		s = s.toLowerCase();
		if(isPalindrome(s))
		System.out.println("\""+s+"\" is pallindrome");
		else
		System.out.println("\""+s+"\" is not pallindrome");
		}
public static boolean isPalindrome(String str)
 {
 String rev = "";
 for (int i = str.length() - 1; i >= 0; i--) {
 rev = rev + str.charAt(i);
 }
 return str.equals(rev);
 }

}