package Builder;

public class TeaBuilder extends StarbucksBuilder {
    @Override
    public void buildSize() {
        starbucks.setSize("Medium");
    }

    @Override
    public void buildDrink() {
        starbucks.setDrink("Tea");
    }
}