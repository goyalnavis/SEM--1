package helloworld;
import java.util.*;
public class E1P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=x;
		x=y;
		y=z;
		System.out.println("X ="+x);
		System.out.println("Y ="+y);
	}

}
