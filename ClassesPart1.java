public class ClassesPart1 {
    public static void main(String[] args) {

        Car car = new Car();
        car.setMake("");
        car.setModel("911");
        car.setDoors(2);
        car.setColor("Yellow");
        car.setConvertible(true);
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getDoors());
        System.out.println(car.getColor());
        System.out.println(car.isConvertible());
    }
}
