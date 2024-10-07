package src.array;

import java.util.Arrays;

public class SmallestAndBiggest {


    public static int[] findSmallestAndBiggestElement(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int biggest = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > biggest) {
                biggest = j;
            }
            if (j < smallest) {
                smallest = j;
            }
        }
        return new int[]{smallest, biggest};
    }


    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 6, 2};
        int[] result = findSmallestAndBiggestElement(arr);
        System.out.println(Arrays.toString(result));
    }
}
