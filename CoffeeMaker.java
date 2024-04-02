public class CoffeeMaker extends Product {

    private boolean hasToDoWork;

    public CoffeeMaker(String model, String manufacturer, boolean hasToDoWork) {
        super(model, manufacturer);
        this.hasToDoWork = hasToDoWork;
    }

    public boolean isHasWorkToDo() {
        return hasToDoWork;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasToDoWork = hasWorkToDo;
    }

    public void brewCoffee() {
        if(isHasWorkToDo() == true) {
            System.out.println("Brewing Coffee...");
            setHasWorkToDo(false);
        }
    }
}
