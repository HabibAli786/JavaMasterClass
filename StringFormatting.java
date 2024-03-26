import java.awt.*;

public class StringFormatting {
    public static void main(String[] args) {
        String bulletIt = "Print a bulleted list:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Second Point";

        System.out.println(bulletIt);

        String stringBlock = """
                Print a bulleted list
                    \u2022 First Point
                        \u2022 Second Point
                """;
        System.out.println(stringBlock);

        int age = 35;

        int yearOfBirth = 2023;

        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);

        System.out.printf("Your age is %.2f%n", (float) age);

        for (int i = 1; i <= 100000; i*= 10) {
            System.out.printf("Printing %6d %n", i);
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);

        System.out.println(formattedString);
    }
}
