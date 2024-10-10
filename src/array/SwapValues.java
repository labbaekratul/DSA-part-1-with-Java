package src.array;

import java.util.Arrays;

public class SwapValues {

    public static void swap(int a, int b) {
        System.out.println("OLD a  Value: " + a);
        System.out.println("OLD b  Value: " + b);
        a = a + b; // 5
        b = a - b;
        a = a - b;
        System.out.println("NEW a  Value: " + a);
        System.out.println("NEW b Value: " + b);
    }

    public static int[] swapArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;

//        for (int i = n - 1; i >= 0; i--) {
//            ans[j++] = arr[i];
//        }
       int i = n-1;
        while ( i >=0)  {
            ans[j++] = arr[i--];
        }
        return ans;
    }


    static int[] reverseArray (int [] arr) {
        int start = 0, end = arr.length -1;
        while (start < end) {
              int temp = arr[start];
              arr[start] = arr[end];
              arr[end] = temp;
              start++;
              end--;
        }

        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int [] result =  reverseArray(arr);
        System.out.println(Arrays.toString(result));
    }

}
