public class Dog extends Animal{

    private String earShape;
    private String tailShape;

    public Dog() {
        super("Mutt", "big", 200);
    }

    public Dog(String type, double weight, String size) {
        this(type, size, weight, "Perky", "Curled");
    }

    public Dog(String type, String size, double weight, String earShape, String tailShape) {
        super(type, size, weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
    @Override
    public void makeNoise() {
        if (type == "Wolf") {
            System.out.println("Ow Wooooo");
        }
        bark();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dogs run and walk while moving their tail");
        if (speed == "Slow") {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }

        System.out.println();
    }

    private void bark() {
        System.out.println("Woof! ");
    }

    private void run() {
        System.out.println("Dog Running! ");
    }

    private void walk() {
        System.out.println("Dog Walking!");
    }

    private void wagTail() {
        System.out.println("Dog Wagging Tail! ");
    }
}
