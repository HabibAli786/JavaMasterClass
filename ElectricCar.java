public class ElectricCar extends CarPoly {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Electric motor started....");
        System.out.printf("With a battery size of of %d Kw", batterySize);
        System.out.println("");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Electric motor driving....");
        System.out.printf("With an average of %f Km per charge", avgKmPerCharge);
        System.out.println("");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("Electric motor running....");
    }
}
