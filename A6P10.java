package helloworld;
import java.util.*;
public class A6P10 {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("area of Triangle is"+area(5,10));
System.out.println("area of Square is"+area(5));
System.out.println("area of Circle is"+area(8));
System.out.println("area of Rectangle"+area(7,8));
}
public static double area(int b,int h) {
	return(0.5*b*h);
}
public static double area(double s) {
	return(s*s);
}
public static double area(int r) {
	return(Math.PI*r*r);
}
public static double area(double p,double b) {
	return (p*b);
}
}
