public class CarPolyMain {
    public static void main(String[] args) {
        GasPoweredCar bmw = new GasPoweredCar("BMW", 23, 8);
        bmw.startEngine();
        bmw.runEngine();
        bmw.drive();
    }
}
