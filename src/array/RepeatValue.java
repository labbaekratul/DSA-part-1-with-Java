package src.array;

import java.util.HashSet;


public class RepeatValue {

    public static int findFirstRepeatedValue(int[] arr) {

        HashSet<Integer> seen = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (seen.contains(arr[i])) {
                return arr[i];

            }
            seen.add(arr[i]);
        }
        return -1;
    }

    public static void main(String[] args) {
        int result = findFirstRepeatedValue((new int[]{1, 2, 5, 4, 2, 6, 3, 4}));
        System.out.println(result);
    }
}
