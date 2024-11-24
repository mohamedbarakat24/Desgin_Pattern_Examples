package Builder;

public abstract class StarbucksBuilder {
    protected Starbucks starbucks;

    public StarbucksBuilder() {
        starbucks = new Starbucks();
    }

    public abstract void buildSize();
    public abstract void buildDrink();

    public Starbucks getStarbucks() {
        return starbucks;
    }
}