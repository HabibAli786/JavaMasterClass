public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Time");
        System.out.println("Hello World");

        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore <= 100) {
            System.out.println("You got the high score");
        }

        int secondTopScore = 81;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }

        if (topScore > 90 || secondTopScore <= 90) {
            System.out.println("Either or both conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("this is an error");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        System.out.println(isDomestic);

        double doubleVariableOne = 20.00;
        double doubleVariableSecond = 80.00;
        double totalDouble = (doubleVariableOne + doubleVariableSecond) * 100;

        double remainderDouble = totalDouble % 40.00;

        boolean isDoubleForty = false;

        if (remainderDouble == 40.00) {
            isDoubleForty = true;
        }

        System.out.println("Is double forty: " + isDoubleForty);

        if (isDoubleForty) {
            System.out.println("Got some remainder");
        }

    }

    public static void hello(String[] args) {

    }
}
