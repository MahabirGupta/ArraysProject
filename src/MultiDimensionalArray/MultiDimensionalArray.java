package MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        int[][] twoDimensionalArray = new int[4][4];
//        System.out.println(Arrays.toString(twoDimensionalArray));
        System.out.println("twoDimensionalArray.length = " +twoDimensionalArray.length);

        for (int[] outer : twoDimensionalArray) {
//            System.out.println(outer);
            System.out.println(Arrays.toString(outer));
        }
        System.out.println("-".repeat(20));

        for (int i = 0; i < twoDimensionalArray.length; i++) {
//            use var so that Java can know the datatype of the array
            var innerArray = twoDimensionalArray[i];
            for (int j = 0; j < innerArray.length; j++) {
                System.out.print(twoDimensionalArray[i][j] + " ");

            }
//            to go to the next line
            System.out.println();


        }

        System.out.println("-".repeat(20));

        for (var outer:twoDimensionalArray){
            for (var element:outer){
                System.out.print(element + " ");
            }
//            go to the next line
            System.out.println();
        }

        System.out.println("-".repeat(20));
        System.out.println(Arrays.deepToString(twoDimensionalArray));

        System.out.println("-".repeat(20));

        for (int i = 0; i < twoDimensionalArray.length; i++) {
//            use var so that Java can know the datatype of the array
            var innerArray = twoDimensionalArray[i];
            for (int j = 0; j < innerArray.length; j++) {
//                System.out.print(twoDimensionalArray[i][j] + " ");
                twoDimensionalArray[i][j] = (i*10) + (j+1);

            }
//            to go to the next line
//            System.out.println();


        }
        System.out.println(Arrays.deepToString(twoDimensionalArray));
//        initialising the second row of a twoDimensionalArray
        twoDimensionalArray[1] = new int[]{10,20,30};
        System.out.println(Arrays.deepToString(twoDimensionalArray));

//        Create a 1-dimensional array
        Object[] anyArray = new Object[3];
        System.out.println(Arrays.toString(anyArray));

        anyArray[0] = new String[]{"a","b","c"};
        System.out.println(Arrays.deepToString(anyArray));

//        making row 1, column 1 a 2 dimensional array
        anyArray[1] = new String[][]{
                {"1","2"},
                {"3","4","5"},
                {"6","7","8","9"}
        };
        System.out.println(Arrays.deepToString(anyArray));

        //        making row 1, column 2 a 3 dimensionnal array
        anyArray[2] = new int[2][2][2];
        System.out.println(Arrays.deepToString(anyArray));

        for (Object element:anyArray){
            System.out.println("Element type = " + element.getClass().getSimpleName());
            System.out.println("Element toString() = " + element);
            System.out.println(Arrays.deepToString((Object[]) element));
        }



    }


}
