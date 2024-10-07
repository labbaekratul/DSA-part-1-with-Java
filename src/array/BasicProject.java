package src.array;

import java.util.Scanner;

public class BasicProject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many day's temperature? ");
        int numDays = Integer.parseInt(scanner.nextLine());
        // recode temperatures and find average
        int[] temps = new int[numDays];
        int total = 0;
        for (int i = 0; i < numDays; i++) {
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            temps[i] = Integer.parseInt(scanner.nextLine());
            total += temps[i];
        }
        double average = (double) total / numDays;
        // count days above average
        int above = 0;
        for (int i = 0; i <temps.length ; i++) {
            if(temps[i] > average) {
                above++;
            }
        }
        System.out.println("Average = " + average);
        System.out.println( above +" days above average");
    }


}
