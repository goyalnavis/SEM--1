package helloworld;

import java.util.Scanner;

public class A5P1 {

	public static void main(String[] args) {// amicable number
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Sum = 0, Sum1 = 0;
		System.out.print("Enter the first number: ");   
		int a = sc.nextInt();  
		System.out.print("Enter the second number: ");    
		int b = sc.nextInt();  
		for(int i=1;i<a;i++)  
		{  
		if(a % i == 0)  
		{  
		 Sum = Sum + i;  
		}  
		}  
		for(int i=1;i<b;i++)  
		{            
		if(b % i == 0)  
		{   
		 Sum1 =  Sum1 + i;  
		}  
		}   
		if((a ==  Sum1) && (b ==  Sum))  
		{  
		System.out.println(a+", "+ b +" are amicable numbers.");  
		}  
		else  
		{  
		System.out.println(a+", "+ b +" are not amicable numbers.");  
		}  
		
	}

}
