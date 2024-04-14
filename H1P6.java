package helloworld;
import java.util.*;
public class H1P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner (System.in);
		 System.out.println("Enter your gender (Male/Female):");
	        String gender = in.nextLine();

	        System.out.println("Enter your first name:");
	        String firstName = in.nextLine();

	        System.out.println("Enter your last name:");
	        String lastName = in.nextLine();

	        System.out.println("Enter your age:");
	        int age = in.nextInt();

	        if (gender.equalsIgnoreCase("female")) {
	            if (age >= 20) {
	                System.out.println("Are you married? (Yes/No):");
	                in.nextLine(); // Consume the newline character
	                String marriedStatus = in.nextLine();
	                
	                if (marriedStatus.equalsIgnoreCase("yes")) {
	                    System.out.println("The I shall call you " + "Mrs. " + firstName + " " + lastName);
	                }
	                else {
	                    System.out.println("The I shall call you " + "Ms. " + firstName + " " + lastName);
	                }
	            } 
	            else {
	                System.out.println("The I shall call you" +firstName + " " + lastName);
	            }
	        }
	        else if (gender.equalsIgnoreCase("male")) {
	            if (age >= 20) {
	                System.out.println("Mr. " + firstName + " " + lastName);
	            }
	            else {
	                System.out.println("The I shall call you" +firstName + " " + lastName);
	            }
	        }
	        else {
	            System.out.println("Gender input is invalid.");
	        }
	}

}
