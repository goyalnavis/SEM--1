package helloworld;

import java.util.Scanner;

public class A3P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner (System.in);
		System.out.println("enter the quantity of water Alice drank");
		int x=in.nextInt();
		if (x>=5000)
			System.out.println("\"Yes, Alice is following doctor's advice\"");
		else 
			System.out.println("\"NO,Alice is not following doctor's advice\"");
	}

}
