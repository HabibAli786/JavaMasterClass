import java.util.Scanner;

public class MinMaxScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minNum = 0;
        int maxNum = 0;
        int currentNumber = 0;
        boolean isNumberValid = true;

        while (isNumberValid) {
            System.out.println("Please enter a number or enter any character to quit");
            String input = scanner.nextLine();
            try {
                currentNumber = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                isNumberValid = false;
            }
            if (currentNumber > maxNum) {
                maxNum = currentNumber;
            } else {
                minNum = currentNumber;
            }
            System.out.println("Min number is " + minNum);
            System.out.println("Max number is " + maxNum);
        }

        System.out.println("Exiting Program...");
    }
}
