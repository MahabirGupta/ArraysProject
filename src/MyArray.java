import java.util.Arrays;
import java.lang.Object;
public class MyArray {

    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 2.9;
        System.out.println(myDoubleArray[2]);

        int[] intArray = {1,2,3,4,5,6,7,8,9,12};
        System.out.println(intArray[4]);
        int length = intArray.length;
        System.out.println("Length of Array = " + length);
        System.out.println("Last element of array: " + intArray[intArray.length -1]);

        int[] array = {5,4,3,2,1};
        for (int i = 0; i <= array.length -1; i++) {


            System.out.print(array[i] + " ");


        }

        System.out.println();
        int[] numberArray = new int[5];
        for (int i = 0; i <=numberArray.length-1 ; i++) {
            numberArray[i] = i;
            System.out.print(numberArray[i] + " ");

        }
        System.out.println();
        for (int i = 0; i <=numberArray.length-1 ; i++) {
            numberArray[i] = numberArray.length-i;
            System.out.print(numberArray[i] + " ");

        }
        System.out.println();
        for (int element:numberArray){
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(numberArray)); //to print arrays

        Object objectVariable = numberArray;
        if (objectVariable instanceof int[]){
            System.out.println("objectVariable is an int array");
        }

        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello"; //"Hello" is a String literal
        objectArray[1]= new StringBuilder("World");
        System.out.println(objectArray[0] + " " + objectArray[1]);
        objectArray[2] = numberArray;
        System.out.println(Arrays.toString(objectArray) );
        System.out.println(Arrays.toString(objectArray) + Arrays.toString((int[]) objectArray[2]));

    }
}
