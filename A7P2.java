package helloworld;
import java.util.*;
public class A7P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] occurrences = new int[101]; // Index 0 is not used

	        // Read integers until 0 is encountered
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter integers between 1 and 100 (end with 0):");

	        int num;
	        do {
	            num = scanner.nextInt();
	            if (num >= 1 && num <= 100) {
	                occurrences[num]++;
	            } else if (num != 0) {
	                System.out.println("Invalid input. Please enter integers between 1 and 100.");
	            }
	        } while (num != 0);

	        // Display the occurrences of each integer
	        System.out.println("Occurrences of integers between 1 and 100:");
	        for (int i = 1; i <= 100; i++) {
	            if (occurrences[i] > 0) {
	                System.out.println(i + ": " + occurrences[i] + " times");
	            }
	        }
	}

}
