package helloworld;
import java.util.*;
public class A5P2 {

	public static void main(String[] args) {//twisted prime
		// TODO Auto-generated method stub
Scanner in=new Scanner (System.in);
int m=0,c=0,reverse = 0;
System.out.println("Enter a number");
int num = in.nextInt();
for (int i = 2;i<=Math.sqrt(num);i++)
{
	if (num%i==0)
	{
		 m++;
	}
}
while (num>0)
{
	int d = num%10;
	reverse = (reverse*10)+d;
	num/=10;
}
for (int i = 2;i<=Math.sqrt(reverse);i++)
{
	if (reverse % i==0)
		c++;
}
if (c==0&&m==0)
{
	System.out.println("Twisted prime");
}
else
{
	System.out.println("Not twisted prime");
}
	}
}

		


