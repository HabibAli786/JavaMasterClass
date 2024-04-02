public class DishWasher extends Product {
    private boolean hasToDoWork;

    public DishWasher(String model, String manufacturer, boolean hasToDoWork) {
        super(model, manufacturer);
        this.hasToDoWork = hasToDoWork;
    }

    public boolean isHasToDoWork() {
        return hasToDoWork;
    }

    public void setHasToDoWork(boolean hasToDoWork) {
        this.hasToDoWork = hasToDoWork;
    }

    public void doDishes() {
        if(isHasToDoWork() == true) {
            System.out.println("Doing dishes...");
            setHasToDoWork(false);
        }
    }
}
