package helloworld;
import java.util.*;
public class H1P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.println("Enter  '0' for Scissor");
System.out.println("Enter  '1' for rock ");
System.out.println("Enter  '2' for paper ");
int user = in.nextInt();
Random sc=new Random();
int cp=sc.nextInt(0,3);
System.out.println("Computer is " +cp);
System.out.println("User is "+user);
if (cp==user) {
	System.out.println("Draw");
}
	else if((cp==0 && user==1)|| (cp==1 && user==2) || (cp==2 && user==0)) {
		System.out.println("You Won");
	}
	else {
		System.out.println("Computer won");
}


	}

}
