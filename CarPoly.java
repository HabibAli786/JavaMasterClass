public class CarPoly {
    private String description;

    public CarPoly(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Engine started...");
    }

    public void drive() {
        System.out.println("Car is driving...");
    }

    protected void runEngine() {
        System.out.println("Engine is running...");
    }
}
