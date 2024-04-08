public class Item {

    private String name;
    private String type;
    private double price;
    private String size;

    public Item(String name, String type, double price, String size) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.size = size;
    }

    public double getBasePrice() {
        return price;
    }

    public double getAdjustedPrice() {
        if(size == "Small") {
            return price;
        } else if (size == "Medium") {
            return price + 3;
        } else if (size == "Large") {
            return price + 4;
        }

        return -1;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
