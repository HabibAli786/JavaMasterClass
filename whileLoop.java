public class whileLoop {
    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }
//
//        int j = 1;
//        while (j <= 5) {
//            System.out.println(j);
//            j++;
//        }
//
//        do {
//            System.out.println("Hello");
//            System.out.println(j);
//            j++;
//        } while (j > 5);

//        int number = 0;
//        while (number < 50) {
//            number += 5;
//            if(number % 25 == 0) {
//                continue;
//            }
//            System.out.print(number + "_");
//        }

        int i = 5;
        int count = 0;
        int count2 = 0;
        while (i <= 20) {
            if(isEvenNumber(i)) {
                count++;
                System.out.println("Number " + i + " is a even number");
                if (count == 5) {
                    break;
                }
            } else {
                count2++;
                System.out.println("Number " + i + " is not an even number");
            }
            i++;
        }

        System.out.println("Total number of even numbers found " + count);
        System.out.println("Total number of even numbers found " + count2);
    }

    public static boolean isEvenNumber(int number) {
        if(number % 2 == 0) {
            return true;
        }

        return false;
    }
}
