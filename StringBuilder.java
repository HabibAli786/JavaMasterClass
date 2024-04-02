public class StringBuilder {
    public static void main(String[] args) {
        String helloworld = "Hello" + "World";
        helloworld.concat(" and Goodbye ");

        java.lang.StringBuilder helloWorldBulilder = new java.lang.StringBuilder("Hello" + "World");
        helloWorldBulilder.append(" and Goodbye ");


        printInformation(helloworld);
        printInformation(helloWorldBulilder);

        java.lang.StringBuilder emptyStart = new java.lang.StringBuilder();
        emptyStart.append("a".repeat(57));

        java.lang.StringBuilder emptyStart32 = new java.lang.StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printInformation(emptyStart);
        printInformation(emptyStart32);

        java.lang.StringBuilder builderPlus = new java.lang.StringBuilder("Hello" + "World");
        builderPlus.append(" and Goodbye ");

        System.out.println(builderPlus);
        builderPlus.replace(15, 16, "G");
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(7);
        printInformation(builderPlus);
    }

    public static void printInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("String length = " + string.length());
    }

    public static void printInformation(java.lang.StringBuilder builder) {
        System.out.println("StringBuilder = " + builder);
        System.out.println("StringBuilder length = " + builder.length());
        System.out.println("capacity = " + builder.capacity());
    }
}
