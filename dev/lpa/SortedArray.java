package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        arr(5);
    }

    public static int[] arr(int size) {
        int[] intArray = new int[size];

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i <= intArray.length-1; i++) {
            System.out.println("Enter a number");
            int userNum = scanner.nextInt();
            intArray[i] = userNum;
        }

        return intArray;
    }
}
