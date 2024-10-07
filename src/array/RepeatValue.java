package src.array;

public class RepeatValue {

    public static int findFirstRepeatedValue(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                   return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int result = findFirstRepeatedValue((new int[]{1, 2, 5, 3, 4, 2, 6, 3, 4}));
        System.out.println(result);
    }
}
