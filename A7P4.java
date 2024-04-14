package helloworld;
import java.util.*;
public class A7P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {3, 2, 6, 1,5,7, 43};
        int secondLargest = findSecondLargest(array);
        System.out.println("The second largest value in the array is: " + secondLargest);
    }

    public static int findSecondLargest(int[] array) {
        if (array == null || array.length < 2) {
            System.out.println("Array length should be at least 2.");
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element in the array.");
            return -1;
        }

        return secondLargest;
		}

}
