package helloworld;
import java.util.*;
public class A6P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count=1;
for(int i=1;i<=100;i++) {
	System.out.print(getPentagonalNumber(i)+"\t");
	if(count %10==0) 
		System.out.println();	
	count ++;
	
}

	}

	private static int getPentagonalNumber(int n) {
		// TODO Auto-generated method stub
		return (n*(3*n-1)/2);
	

}
}
