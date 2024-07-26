package UsingArrays;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] randomArray = getRandomArray(5);
        System.out.println(Arrays.toString(randomArray));
//        sorting the elements of an array
        Arrays.sort(randomArray);
        System.out.println(Arrays.toString(randomArray));

        int[] secondArray = new int[5];
        System.out.println(Arrays.toString(secondArray));
//        fill the elements of an array
        Arrays.fill(secondArray,1);//sets all 5 elements to 1
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray,0,4,9);//sets elements 0 to 4 to the value of 9
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(8);
        Arrays.sort(thirdArray);
        System.out.println(Arrays.toString(thirdArray));
//        Copying one array to another
        int[] fourthArray = Arrays.copyOf(thirdArray,9);
        System.out.println(Arrays.toString(fourthArray));
//        Copying one array to another
        int[] fifthArray = Arrays.copyOf(thirdArray,thirdArray.length);
        System.out.println(Arrays.toString(fifthArray));
        //        Copying one array to another
        int[] sixthArray = Arrays.copyOf(thirdArray,3);
        System.out.println(Arrays.toString(sixthArray));

//        Finding an element in an array after sorting the array
        String[] stringArray = {"Ashvin", "Gaytri","Nandu","Durgesh","Sudhir"};
        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));
        if (Arrays.binarySearch(stringArray,"Nandu") >=0){
            System.out.println("Found Nandu in the list");
        }

//        Comparing the values of 2 arrays
        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5};
        if (Arrays.equals(s1,s2)){
            System.out.println("The two arrays are equal");
        }else {
            System.out.println("The two arrays are not equal");
        }

    }

    private static int[] getRandomArray(int len){

        Random random = new Random();
        int[] intArray = new int[len];
        for (int i = 0; i < len ; i++) {

            intArray[i] = random.nextInt(100); //returns a number from 0 to 99 excluding 100

        }
        return intArray;

    }
}
