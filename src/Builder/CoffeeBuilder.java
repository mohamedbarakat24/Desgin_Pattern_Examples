package Builder;

public class CoffeeBuilder extends StarbucksBuilder {
    @Override
    public void buildSize() {
        starbucks.setSize("Large");
    }

    @Override
    public void buildDrink() {
        starbucks.setDrink("Coffee");
    }
}