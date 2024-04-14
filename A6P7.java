package helloworld;
import java.util.*;
public class A6P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.print("Enter the word: ");
String s=in.nextLine();
s=s.toLowerCase();
System.out.println("Number of vowels in the given word is "+count(s));
	}
	public static int count(String str) {
		int vowel=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				vowel++;
		}
		return vowel;
	}

}
