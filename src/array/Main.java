package src.array;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        SingleDimensionalArray sda = new SingleDimensionalArray(10);
//        sda.insert(0, 10);
//        sda.insert(1, 20);
//        sda.insert(2, 30);
//        sda.insert(3, 40);
//        sda.insert(4, 50);
//        sda.insert(5, 60);
//        sda.insert(6, 70);
//        sda.insert(7, 80);
//        sda.insert(8, 90);
//        sda.insert(9, 100);
//
//        sda.traverseArray();

        TwoDimensionalArray tda = new TwoDimensionalArray(3, 3);
        tda.insertValueInTheArray(0,0,10);
        tda.insertValueInTheArray(0,1,20);
        tda.insertValueInTheArray(0,2,30);
        tda.insertValueInTheArray(1,0,40);
        tda.insertValueInTheArray(1,1,50);
        tda.insertValueInTheArray(1,2,60);
        tda.insertValueInTheArray(2,0,70);
        tda.insertValueInTheArray(2,1,80);
        tda.insertValueInTheArray(2,2,90);

        System.out.println(Arrays.deepToString(tda.arr));
        tda.accessCell(1,1);
        tda.traverseArray();
        tda.searchingValue(70);
    }

}
