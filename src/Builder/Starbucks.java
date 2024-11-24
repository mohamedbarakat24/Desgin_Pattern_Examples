package Builder;

public class Starbucks {
    private String size;
    private String drink;

    public void setSize(String size) {
        this.size = size;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "Size: " + size + ", Drink: " + drink;
    }
}