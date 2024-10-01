package src;

public class ArrayUtil {

    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void arrayDemo() {
        int[] myArray = new int[5];
        myArray[0] = 5;
        myArray[1] = 7;
        myArray[2] = 9;
        myArray[3] = 2;
        myArray[4] = 19;
        printArray(myArray);
        System.out.println("Length of this array : " + myArray.length);
        System.out.println("Last index value of this array : " + myArray[myArray.length - 1]);

        int[] arr = {5, 2, 1, 7};
        printArray(arr);
    }

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.arrayDemo();
    }
}
