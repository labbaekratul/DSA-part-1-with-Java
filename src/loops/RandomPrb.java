package src.loops;

import java.util.Scanner;

public class RandomPrb {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int n = sc.nextInt();
//        int ans = 1;
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int ans = 1;

        for (int i = 1; i <=b ; i++) {
            ans *= a;
        }

        System.out.println(ans);

//        for (int i = 1; i <= n; i++) {
//            ans *= i;
//            System.out.println(ans);
//        }


//        for (int i = 1; i <=n; i++) {
//            if (i % 2 == 0) {
//                ans -= i;
//            } else {
//                ans += i;
//            }
//
//        }
//
//        System.out.println(ans);


    }
}
