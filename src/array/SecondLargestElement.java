package src.array;

public class SecondLargestElement {

    public static int findSecondLargestNumber(int[] arr) {
        int maxValue = Integer.MIN_VALUE;
        int secondMaxValue = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                secondMaxValue = maxValue;
                maxValue = arr[i];

            } else if (arr[i] > secondMaxValue && arr[i] != maxValue) {
                secondMaxValue = arr[i];
            }
        }
        return secondMaxValue;
    }


    public static void main(String[] args) {

        int result = findSecondLargestNumber(new int[]{9, 8, 9, 6, 9, 5, 8, 10, 11, 14});
        System.out.println(result);
    }
}
