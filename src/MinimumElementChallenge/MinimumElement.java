package MinimumElementChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) {
        int sizeOFArray = readIntegers();
        int[] array=readElements(sizeOFArray);
        System.out.println(Arrays.toString(array));
        int minimumElement = findMin(array);
        System.out.println("Minimum element is: " + minimumElement);
    }

    public static int[] readElements(int sizeOFArray) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayInt = new int[sizeOFArray];
        for (int i = 0; i <sizeOFArray ; i++) {
            System.out.print("Enter element " + i +": ");
            arrayInt[i] = scanner.nextInt();

        }
        return arrayInt;

    }

    public static int findMin(int[] intArray) {

        int min =Integer.MAX_VALUE;
        for (int element:intArray){
            if (element < min){
                min = element; // set minimum to be the current value of the element
            }

        }
        return min;

    }


    public static int readIntegers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int arraySize = scanner.nextInt();
        return arraySize;
    }
}
