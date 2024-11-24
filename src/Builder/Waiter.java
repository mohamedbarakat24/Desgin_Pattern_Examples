package Builder;

public class Waiter {
    private StarbucksBuilder starbucksBuilder;

    public void setStarbucksBuilder(StarbucksBuilder starbucksBuilder) {
        this.starbucksBuilder = starbucksBuilder;
    }

    public Starbucks getStarbucksDrink() {
        return starbucksBuilder.getStarbucks();
    }

    public void constructStarbucks() {
        starbucksBuilder.buildSize();
        starbucksBuilder.buildDrink();
    }
}