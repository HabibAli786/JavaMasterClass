public class GasPoweredCar extends CarPoly {

    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Gas engine started....");
        System.out.printf("With %d cylinders", cylinders);
        System.out.println("");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Gas engine driving....");
        System.out.printf("With an average of %f Km per Litre", avgKmPerLitre);
        System.out.println("");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("Gas engine running....");
    }
}
