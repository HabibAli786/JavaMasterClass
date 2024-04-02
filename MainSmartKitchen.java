public class MainSmartKitchen {
    public static void main(String[] args) {
        CoffeeMaker brewMaster = new CoffeeMaker("brewmaster2000", "Costa", false);
        DishWasher dishWasher = new DishWasher("washer200", "Bosch", false);
        Refrigerator icebox = new Refrigerator("icecool", "Sony", false);
        SmartKitchen smartKitchen = new SmartKitchen("New Kitchen", "Wickes", brewMaster, dishWasher, icebox);

        smartKitchen.doKitchenWork();
    }
}
