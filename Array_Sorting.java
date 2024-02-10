import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Array_Sorting {

    static void Ascending() {
        int[] numbers = { 41, 79, 89, 30, 51, 95, 77, 98, 12, 44 };

        Arrays.sort(numbers);
        System.out.println("");
        System.out.println("Ascending order: " + Arrays.toString(numbers));

    }

    static void Descending() {
        int[] numbers = { 41, 79, 89, 30, 51, 95, 77, 98, 12, 44 };

        // convertion of array to an object
        Integer[] numbersObj = new Integer[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numbersObj[i] = Integer.valueOf(numbers[i]);
        }

        // sorting of the integer into a descending order
        Arrays.sort(numbersObj, Collections.reverseOrder());

        System.out.println("");
        System.out.println("Descending order: " + Arrays.toString(numbersObj));

    }

    static void Subarray() {
        int[] numbers = { 41, 79, 89, 30, 51, 95, 77, 98, 12, 44 };

        int[] subarray = Arrays.copyOfRange(numbers, 1, 5);
        System.out.println("");
        System.out.println("Subarray: " + Arrays.toString(subarray));
    }

    public static void main(String[] args) {

        while (true) {
            Scanner scan = new Scanner(System.in);

            System.out.println("");
            System.out.println("Given Array: ");
            System.out.println("41, 79, 89, 30, 51, 95, 77, 98, 12, 44");
            System.out.println(" ");
            System.out.println("Array Manipulation");
            System.out.println("Pick mode ");
            System.out.println("");
            System.out.println("[1] Arrange array to Ascending Order");
            System.out.println("");
            System.out.println("[2] Arrange array to Descending Order");
            System.out.println("");
            System.out.println("[3] Copy the range elements of an Array");
            int index = scan.nextInt();

            switch (index) {
                case 1:
                    Ascending();
                    break;
                case 2:
                    Descending();
                    break;
                case 3:
                    Subarray();
                    break;
                default:
                    System.out.println("Invalid Option, Try Again.");
                    break;
            }

        }
    }
}
