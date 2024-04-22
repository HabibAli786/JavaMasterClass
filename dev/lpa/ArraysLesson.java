package dev.lpa;

import java.util.Arrays;

public class ArraysLesson {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[5] = 50;
        System.out.println(myIntArray[0]);

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;

        int firstTen[] = {1,2,3,4,5,6,7,8,9,10};

        int newArray[];
        newArray = new int[] {5,4,3,2,1};
        for (int i=0; i < newArray.length-1; i++) {
            System.out.println(newArray[i]);
        }
        System.out.println();

        for (int element : newArray) {
            System.out.println(element);
        }
        System.out.println();

        System.out.println(Arrays.toString(newArray));

        Object objectVariable = newArray;
        if (objectVariable instanceof int[]) {
            System.out.println("objectVariable is really an int array");
        }

        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = 3;

        System.out.println(Arrays.toString(objectArray));


    }
}
