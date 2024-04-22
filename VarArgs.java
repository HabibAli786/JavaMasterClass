public class VarArgs {
    public static void main(String... args) {

        System.out.println("Hello World Again");

        String[] splitStrings = "Hello World Again".split(" ");
        printText(splitStrings);

        System.out.println("=".repeat(20));
        printText("Hello");

        System.out.println("=".repeat(20));
        printText("Hello", "World", "Again");

        String[] Array = {"first", "second", "Third", "Fourth"};
        System.out.println(String.join(",", Array));
    }

    private static void printText(String... textList) {

        for(String t: textList) {
            System.out.println(t);
        }
    }
}
