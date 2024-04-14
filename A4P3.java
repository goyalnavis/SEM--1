package helloworld;
import java.util.*;
public class A4P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.println("Enter the Value of N");
int N=in.nextInt();

if(N<=0) {
	System.out.println("Enter the positive number form greater then Zero");
	
}

int sum=0;
int i=0;
System.out.println("Random integer between 1 to "+N+ ":");
do {
	int random=(int) (Math.random()*N)+1;
	System.out.print(random+" ");
	sum+= random;
	i++;
}
while(i<N);
double avg=(double)sum/N;
System.out.println("\nThe average of "+N+" random numbers are "+avg);
	}

}
