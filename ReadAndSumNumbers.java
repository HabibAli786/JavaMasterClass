import java.util.Scanner;

public class ReadAndSumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        int total = 0;
        int x = 1;

        do {
            System.out.println("Please enter number " + x);

            try {
                String number = scanner.nextLine();
                total += Integer.parseInt(number);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number");
                x-=1;
            }
            x++;
        } while (x <= 5);

        System.out.println("Total sum of all numbers " + total);
    }
}
