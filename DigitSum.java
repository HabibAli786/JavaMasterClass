public class DigitSum {
    public static void main(String[] args) {
        sumDigits(111);

    }

    public static int sumDigits (int number) {
        if (number < 0) {
            return -1;
        }

        // 1 2 3 4 5

        int currentDigit = 0;
        int sumOfDigits = 0;
        while (number != 0) {
            System.out.println(number);
            currentDigit = number % 10;
            sumOfDigits += currentDigit;
            number = number / 10;
        }

        System.out.println(sumOfDigits);

        return sumOfDigits;
    }
}
