 package helloworld;
import java.util.*;
public class A5P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int a, b, i, j, flag;
	        System.out.println("Enter lower bound of the interval: ");
	        a = sc.nextInt(); 
	        System.out.println("Enter upper bound of the interval: ");
	        b = sc.nextInt();
	        System.out.println("Prime numbers between a and b are: "+a+" ,"+b);
	        for (i = a; i <= b; i++) {
	            if (i == 1 || i == 0)
	                continue;
	            flag = 1;
	            for (j = 2; j <= i / 2; ++j) {
	                if (i % j == 0) {
	                    flag = 0;
	                    break;
	                }
	            }
	 
	            // flag = 1 means i is prime
	            // and flag = 0 means i is not prime
	            if (flag == 1)
	                System.out.print(i+" ");
	        }
	    
	}

}
