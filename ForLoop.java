public class ForLoop {

    public static void main(String[] args) {
        for(int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }

        System.out.println(calculateIntersetRate(1000, 2.3));

        for(double rate = 2.0; rate <= 5.0; rate ++) {
            System.out.println(rate);
            System.out.println(calculateIntersetRate(2000, rate));
        }

        for (double rate = 7.5; rate <= 10; rate += 0.25) {
            System.out.println("new statement");
            System.out.println(rate);
            System.out.println(calculateIntersetRate(100, rate));
        }
    }

    public static double calculateIntersetRate(double amount, double interest) {
        return (amount * (interest / 100));
    }

}
