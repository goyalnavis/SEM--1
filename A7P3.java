package helloworld;
import java.util.*;
public class A7P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];

        // Read 10 integers from the keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }

        // Ask user to enter the number to be searched
        System.out.print("Enter the number to be searched: ");
        int numberToSearch = scanner.nextInt();

        // Search for the number in the array and count its occurrences
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i] == numberToSearch) {
                count++;
            }
        }

        // Display the result
        if (count > 0) {
            System.out.println("The number " + numberToSearch + " is present in the array " + count + " times.");
        } else {
            System.out.println("The number " + numberToSearch + " is not present in the array.");
        }
	}

}
