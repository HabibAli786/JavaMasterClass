package dev.lpa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListChallenge {
//    0 - shutdown
//    1 - add item to list
//    2 - remove item from list
//    Enter a number for which action you want to do

    public static void main(String[] args) {
        ArrayList<String> groceries = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("0 - shutdown");
        System.out.println("1 - add item to list");
        System.out.println("2 - remove item from list");
        System.out.println("Enter a number for which action you want to do");

        Integer userInput = scanner.nextInt();

        while (userInput != 0) {
            if(userInput == 1) {
                System.out.println("What item would you like to add");
                String item = scanner.next();
                if(groceries.contains(item)) {
                    System.out.println("This item is already included in your items list");
                } else {
                    groceries.add(item);
                    groceries.sort(Comparator.naturalOrder());
                }
                System.out.println("Current Items = " + groceries);
                System.out.println("0 - shutdown");
                System.out.println("1 - add item to list");
                System.out.println("2 - remove item from list");
                System.out.println("Enter a number for which action you want to do");
                userInput = scanner.nextInt();
            }
            if(userInput == 2) {
                System.out.println("What item would you like to remove");
                String item = scanner.next();
                if(!groceries.contains(item)) {
                    System.out.println("This item is is not included in your items list");
                } else {
                    groceries.remove(item);
                    groceries.sort(Comparator.naturalOrder());
                }
                System.out.println("Current Items = " + groceries);
                System.out.println("0 - shutdown");
                System.out.println("1 - add item to list");
                System.out.println("2 - remove item from list");
                System.out.println("Enter a number for which action you want to do");
                userInput = scanner.nextInt();
            }
        }

        System.out.println("You have selected to shutdown... Shutting down now...");


    }
}
