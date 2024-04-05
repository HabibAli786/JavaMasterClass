public class HybridCar extends CarPoly {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Gas engine started....");
        System.out.println("Electric motor started....");
        System.out.printf("With %d cylinders", cylinders);
        System.out.println("");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Gas engine driving....");
        System.out.println("Motor engine driving....");
        System.out.printf("With an average of %f Km per Litre", avgKmPerLitre);
        System.out.println("");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("Gas engine running....");
        System.out.println("Electric motor running....");
        System.out.printf("With a battery size of %d kw", batterySize);
        System.out.println("");
    }
}
