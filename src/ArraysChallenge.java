import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysChallenge {

    public static void main(String[] args) {
        int[] randomArray = generateRandomArray();
        Arrays.sort(randomArray);
        System.out.println(Arrays.toString(randomArray));
        int[] newArray = new int[randomArray.length];
        int count = randomArray.length;
        for (int i = 0; i < randomArray.length ; i++) {
            newArray[i] = randomArray[count - 1];
            count = count -1;
        }
        System.out.println(Arrays.toString(newArray));
    }

    public static int[] generateRandomArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int numOfElements = scanner.nextInt();
        int[] randomArray = new int[numOfElements];
        Random random = new Random();
        for (int i = 0; i < randomArray.length ; i++) {

            randomArray[i] = random.nextInt(30);

        }
        return randomArray;
    }
}
