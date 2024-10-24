package src.loops;

import java.util.Scanner;

public class Patterns {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int r = scanner.nextInt();

        // Rectangular pattern

//        for (int i = 0; i <r ; i++) {
//            for (int j = 0; j <r ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Holo rectangular pattern

//        for (int i = 1; i <= r; i++) {
//            for (int j = 1; j <= r; j++) {
//                if (i == 1 || i == r || j == 1 || j == r)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }


        // Triangular pattern

//                for (int i = 1; i <= r; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        // Reverse triangular pattern

//        for (int i = r; i >= 1; i--) {
//            for (int j = 1; j <=  i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        // Pyramid pattern

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        Rectangular pattern with numbers

//        for (int i = 1; i <=r ; i++) {
//            for (int j = i; j <=r ; j++) {
//                System.out.print(j + " ");
//            }
//            for (int k = 1; k <i ; k++) {
//                System.out.print(k + " ");
//            }
//            System.out.println();
//        }

        // Rectangular pattern with numbers

//        for (int i = 1; i <= r; i++) {
//            for (int j = 1; j <= r; j++) {
//                if ((j + i) % 2 == 0) {
//                    System.out.print(2);
//                } else {
//                    System.out.print(1);
//                }
//            }
//            System.out.println();
//        }
    }
}
