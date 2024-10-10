package src.loops;

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("Please input the number: ");
        int num = sc.nextInt();
        int ans = 0;
        while (num > 0) {
//            ans += num % 10;
            ans = ans * 10 + num % 10;
            num /= 10;
            count++;
        }

        System.out.printf("total number count %d and remainder %d", count, ans);
    }
}
