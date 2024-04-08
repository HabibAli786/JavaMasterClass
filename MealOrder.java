public class MealOrder {

    private Item side;
    private Item drink;
    private Item burger;

    public MealOrder(Item burger, Item side, Item drink) {
        this.burger = burger;
        this.side = side;
        this.drink = drink;
    }

}
