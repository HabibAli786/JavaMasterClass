import java.awt.*;

public class AllAboutStrings {
    public static void main(String[] args) {
        printInformation("Hello World");
        printInformation("");
        printInformation("       ");

        String helloWorld = "Hello World";
        System.out.printf("The index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("The index of World = %d %n", helloWorld.indexOf("World"));
        System.out.printf("The index of l = %d %n", helloWorld.indexOf('l'));

        System.out.printf("The last index of l = %d %n", helloWorld.lastIndexOf('l'));

        System.out.println('\n');

        String helloWorldLower = helloWorld.toLowerCase();
        if(helloWorld.equals(helloWorldLower)) {
            System.out.println("Values match exactly");
        }
        if(helloWorld.equalsIgnoreCase(helloWorldLower)) {
            System.out.println("Values match exactly");
        }

        if(helloWorld.startsWith("Hello")) {
            System.out.println("String starts with Hello");
        }

        if(helloWorld.endsWith("World")) {
            System.out.println("String ends with World");
        }

        if(helloWorld.contains("World")) {
            System.out.println("String contains World");
        }

        if(helloWorld.contentEquals("Hello World")) {
            System.out.println("Content matches exactly");
        }


    }

    public static void printInformation(String string) {
        int length = string.length();

        System.out.printf("Length of string is %d %n", length);

        if(string.isEmpty()) {
            System.out.println("String is empty");
            return;
        }

        if(string.isBlank()) {
            System.out.println("String is blank");
            return;
        }
        System.out.printf("First Char = %c %n", string.charAt(0));
        System.out.printf("Last Char = %c %n", string.charAt(length - 1));
    }
}
