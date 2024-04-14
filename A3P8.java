package helloworld;
import java.util.*;
public class A3P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner (System.in);
System.out.println("Enter the value the coordinates :");
int x=in.nextInt();
System.out.println("The value of the x :" +x);
int y=in.nextInt();
System.out.println("the value of the y :" +y);
int coord =0;
if (x>0 && y>0) {
	coord = 1;
}
else if (x<0 && y>0) {
	coord = 2;
}
else if (x<0 && y<0) {
	coord = 3;
}
else if (x>0 && y<0) {
	coord = 4;
}
else if (x==0 && y<0 || y>0) {
	coord =5;
}
else {
	coord = 6;
}
switch (coord) {
case 1:
	System.out.println("( "+x+","+y+" )"+"is in the I quadrant");
	break;
case 2:
	System.out.println("( "+x+","+y+" )"+"is in the II quadrant");
	break;
case 3:
	System.out.println("( "+x+","+y+" )"+"is in the III quadrant");
	break;
case 4:
	System.out.println("( "+x+","+y+" )"+"is in the IV quadrant");
	break;
case 5:
	System.out.println("( "+x+","+y+" )"+"is in the x-axis");
	break;
case 6:
	System.out.println("( "+x+","+y+" )"+"is in the y-axis");
	break;
	
}
	

	}

}
