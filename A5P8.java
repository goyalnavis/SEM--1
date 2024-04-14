package helloworld;
import java.util.*;
public class A5P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner (System.in);
		System.out.print("Enter the value of n:  ");
		int n=in.nextInt();
		int sum=0;
for(int i=1;i<=n;i++) {
	for(int j=1;j<=i;j++) {
		sum=sum+j;
		
	}
	
}
System.out.println(sum);
	}

}
