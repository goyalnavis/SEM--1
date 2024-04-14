package helloworld;

import java.util.Scanner;

public class A2P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner (System.in);
		System.out.println ("Enter the distance in kilometer");
		int dist = in.nextInt();
		int meter = dist*1000;
		double ft = dist*3280.8399;
		double In = dist*39370.0787;
		int cm = dist*100000;
		System.out.println("Distance in meter ="+meter+ "\n Distance in feet ="+ft+ "\n Distance in inch ="+In+ "\n Distance in centimeter ="+cm);

	}

}
