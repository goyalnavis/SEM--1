package helloworld;

import java.util.Scanner;

public class A5P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner( System.in);
		int mult=1;
		for (int i=2;i<16;i++) {
			for (int j=1;j<=10;j++) {
				mult=i*j;
				
				System.out.println(i+" x "+j+" = "+mult);
				
			}
		}
	}

}
