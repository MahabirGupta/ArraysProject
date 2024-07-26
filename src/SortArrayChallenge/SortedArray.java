package SortArrayChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int arraySize = scanner.nextInt();
        int[] array = getIntegers(arraySize);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int[] sortedArray =sortIntegers(array);
        printArray(sortedArray);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static void printArray(int[] sortedArray) {

//        int[] array = new int[sortedArray.length];

        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println("Element " + i + " contents " + sortedArray[i]);
//            array[i] = sortedArray[i];
        }
    }

//    public static int[] sortIntegers(int[] array) {
//
//        int[] sortArray = new int[array.length];
//        int count = array.length;
//        for (int i = 0; i < array.length ; i++) {
//            sortArray[i] = array[count - 1];
//            count = count -1;
//        }
////        System.out.println(Arrays.toString(sortArray));
//        return sortArray;
//
//    }

    public static int[] getIntegers(int arraySize) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Element " + i + " contents ");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int[] sortIntegers(int[] array) {

        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i=0; i<sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];                     // 1
                    sortedArray[i] = sortedArray[i+1];         // 2
                    sortedArray[i+1] = temp;                   // 3
                    flag = true;                               // 4
                }
            }
        }
        return sortedArray;
    }
}
