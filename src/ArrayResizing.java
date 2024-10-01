package src;

public class ArrayResizing {

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int[] resize(int[] arr, int capacity) {
        int[] temp = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }

    public void arrayDemo() {
        int[] arr = {8, 1, 0, 2, 1, 0, 3};
        printArray(arr);
        int[] result = resize(arr, arr.length * 2);
        printArray(result);

    }

    public static void main(String[] args) {
        ArrayResizing arr = new ArrayResizing();
        arr.arrayDemo();

    }
}
