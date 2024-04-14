package helloworld;
import java.util.*;
public class A7P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 10;

        // Create an array of size N
        int[] array = new int[N];

        // Generate random values and store them in the array
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            array[i] = random.nextInt(100); // Generate random integers between 0 and 99
        }

        // Calculate the sum of the array elements
        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        // Calculate the average of the array elements
        double average = (double) sum / N;

        // Print the array elements
        System.out.println("Array elements:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(); // Print a new line

        // Print the sum and average of the array elements
        System.out.println("Sum of the array elements: " + sum);
        System.out.println("Average of the array elements: " + average);
    }
	}


