package src.array;

import java.util.Arrays;

public class PairSum {

    public static int pairSum(int[] arr, int target) {
        int n = arr.length;
        int[] arr2 = arr.clone();
        int ans = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr2[i] == arr2[j]) {
                    arr2[i] = -1;
                    arr2[j] = -1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr2[i] != -1)
                ans = arr2[i];
        }
        return ans;
    }

    public static void main(String[] args) {

        int result = pairSum(new int[]{1, 2, 3, 4, 2, 1, 3, 4, 7}, 12);

        System.out.println(result);
    }
}
