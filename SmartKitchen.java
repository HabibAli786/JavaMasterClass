public class SmartKitchen extends Product {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(String model, String manufacturer, CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
        super(model, manufacturer);
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }

    private void addWater() {
        brewMaster.setHasWorkToDo(true);
    }

    private void pourMilk() {
        iceBox.setHasToDoWork(true);
    }

    private void loadDishwasher() {
        dishWasher.setHasToDoWork(true);
    }

    private void setKitchenState(boolean coffee, boolean icebox, boolean dishwasher) {
        if(coffee == true) {
            addWater();
        }

        if(icebox == true) {
            pourMilk();
        }

        if(dishwasher == true) {
            loadDishwasher();
        }
    }

    public void doKitchenWork() {
        setKitchenState(true, true, true);
        brewMaster.brewCoffee();
        dishWasher.doDishes();
        iceBox.orderFood();
    }
}
