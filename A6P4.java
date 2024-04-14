package helloworld;

public class A6P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=2000;i<2021;i++) {
	System.out.println("Number of days in year"+i+"is:"+ numberofdays(i));
}
	}
	public static int numberofdays(int year) {
		if (year%4==0 && (year%400==0 || year%100!=0))
			return 366;
		else 
			return 365;
	}

}
