package ReverseArrayChallenge;

import java.util.Arrays;
import java.util.Scanner;



public class ReverseArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i <arraySize ; i++) {
            System.out.print("Enter element " + i + ": ");
            array[i] = scanner.nextInt();

        }
        System.out.println(Arrays.toString(array));
        int[] reverseArray = reverse(array);
        System.out.println(Arrays.toString(reverseArray));
        int[] reverseCopy = reverseCopy(array);
        System.out.println(Arrays.toString(reverseCopy));
    }

//    public static int[] reverse(int[] array) {
//        int[] reverseArray = new int[array.length];
//        System.out.println("Arraylength = " + array.length);
//        int j =0;
//        for (int i = (array.length-1); i >=0 ; i--) {
//
//            reverseArray[i] = array[j];
//            j++;
//        }
//        System.out.println(Arrays.toString(reverseArray));
//        return reverseArray;
//    }

    private static int[] reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length/2;
//        loop only half of the array
        for (int i = 0; i < halfLength; i++) {

            int temp=array[i];
            array[i] = array[maxIndex -i];
            array[maxIndex - i] = temp;
            System.out.println("---> " + Arrays.toString(array));


        }
        return array;
    }

    private static int[] reverseCopy(int[] array){
        int[] reverseArray = new int[array.length];
        int maxIndex = array.length -1;
        for (int element:array){
            reverseArray[maxIndex--] = element;
        }
        return reverseArray;
    }
}
