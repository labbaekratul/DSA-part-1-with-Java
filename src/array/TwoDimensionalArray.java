package src.array;
public class TwoDimensionalArray {

    int[][] arr = null;

    public TwoDimensionalArray(int numberOfRows, int numberOfColumns) {
        this.arr = new int[numberOfRows][numberOfColumns];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    public void insertValueInTheArray(int row, int col, int value) {
        try {
            if(arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] =  value;
                System.out.println("The value is successfully inserted");
            } else {
                System.out.println("This cell is already occupied");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array");
        }
    }

    public void  accessCell(int row, int col) {
        System.out.println("\nAccessing Row#" + row + ", Col#" + col);
        try {
            System.out.println("Cell value is: " + arr[row][col]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array");
        }
    }

    public void traverseArray () {
        for (int i = 0; i <arr.length ; i++) {
//            System.out.println();
            for (int j = 0; j <arr[0].length ; j++) {
                System.out.print(arr[i][j] +" ");
            }
        }
        System.out.println();
    }

    public void searchingValue(int value) {
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j] == value) {
                    System.out.println("Value is found at row: " + i + " Column: " + j);
                }
            }
        }
    }

}
