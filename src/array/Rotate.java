package src.array;

import java.util.Scanner;

public class Rotate {

    // Function to rotate the array to the right by k positions
    static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        // If k is greater than n, we need to perform only k%n rotations
        k = k % n;
        // Resultant array after rotation
        int[] ans = new int[n];

        // Move the last k elements to the beginning of the array
        for (int i = 0; i < k; i++) {
            ans[i] = arr[n - k + i];
        }

        // Move the first n-k elements to the end of the array
        for (int i = k; i < n; i++) {
            ans[i] = arr[i - k];
        }

        return ans;
    }

    // Function to print the array
    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k (number of rotations): ");
        int k = sc.nextInt();

        System.out.println("Original array:");
        printArray(arr);

        // Rotate the array
        int[] ans = rotate(arr, k);

        System.out.println("Array after rotation:");
        printArray(ans);
    }
}
