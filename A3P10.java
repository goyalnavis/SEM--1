 package helloworld;
import java.util.*;
public class A3P10 {

	public static void main(String[] args) {
 		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.println("Enter the marks of the student");
int marks=in.nextInt();
int grade;
if (marks>=90) {
	grade =1;
}
else if (marks>=80 && marks<90) {
	grade=2;
}
else if (marks>=70 && marks<80) {
	grade =3;
}
else if (marks>=60 && marks<70) {
	grade =4;
}
else if (marks>=50 && marks<60) {
	grade = 5;
}
else if (marks>=40 && marks<50) {
	grade = 6;
}
else {
	grade = 7;
}
switch(grade) {
case 1:
	System.out.println("The student gets the first grade 'O' " +marks);
	break;
case 2:
	System.out.println("The student gets the second grade 'A' " +marks);
	break;
case 3:
	System.out.println("The student gets the third grade 'B' " +marks);
	break;
case 4:
	System.out.println("The student gets the fourth grade 'C' " +marks);
	break;
case 5:
	System.out.println("The student gets the fifth grade 'D' " +marks);
	break;
case 6:
	System.out .println("The student gets the sixth grade 'E' " +marks);
	break;
case 7:
	System.out.println("The student gets the fail grade 'F' " +marks);
	break;
}
	}

}
