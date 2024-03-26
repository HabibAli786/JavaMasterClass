import java.util.Scanner;

public class ReadingDataInput {
    public static void main(String[] args) {
        int currentYear = 2024;

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }

    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, what is your name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course");

        String dob = System.console().readLine("Hi, what year were you born? ");
        int age = currentYear - Integer.parseInt(dob);
        System.out.println("You are " + age + " years old");
        return "";
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, What's your name? ");
        String name = scanner.nextLine();

        System.out.println("What year were you born? ");

        boolean validDateOfBirth = false;
        int age = 0;

        do {
            System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <= " + (currentYear));
            try {
                age = checkData(currentYear, scanner.nextLine());
                validDateOfBirth = age < 0 ? false : true;
            } catch (NumberFormatException e) {
                System.out.println("Only numbers allowed. Try again");
            }
        } while (!validDateOfBirth);

        System.out.println("You are " + age + " years old");
        return "";
    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if ((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }

        return currentYear - dob;
    }
}
