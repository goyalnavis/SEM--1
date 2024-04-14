package helloworld;
import java.util.*;
public class A7P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        int[] uniqueNumbers = eliminateDuplicates(numbers);

        System.out.print("The unique numbers are: ");
        for (int num : uniqueNumbers) {
            if (num != 0) {
                System.out.print(num + " ");
            }
        }
    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] uniqueArray = new int[list.length];
        int index = 0;

        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (list[i] == uniqueArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArray[index++] = list[i];
            }
        }

        return uniqueArray;
	
	}

}
