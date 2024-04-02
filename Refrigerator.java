public class Refrigerator extends Product {
    private boolean hasToDoWork;

    public Refrigerator(String model, String manufacturer, boolean hasToDoWork) {
        super(model, manufacturer);
        this.hasToDoWork = hasToDoWork;
    }

    public boolean isHasToDoWork() {
        return hasToDoWork;
    }

    public void setHasToDoWork(boolean hasToDoWork) {
        this.hasToDoWork = hasToDoWork;
    }

    public void orderFood() {
        if(isHasToDoWork() == true) {
            System.out.println("Ordering food...");
            setHasToDoWork(false);
        }
    }
}
