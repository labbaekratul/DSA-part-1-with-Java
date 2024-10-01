package src;

public class FindMissingNumber {

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void demoArray() {
        int[] arr = {2, 4, 1, 8, 6, 3, 7};
        printArray(arr);
        System.out.println("Missing number is : " + findMissing(arr));
    }


    public int findMissing(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        for (int num : arr) {
            sum = sum - num;
        }
        return sum;
    }

    public static void main(String[] args) {
        FindMissingNumber arrUtil = new FindMissingNumber();
        arrUtil.demoArray();

    }
}
