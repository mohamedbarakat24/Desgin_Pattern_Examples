package Decorator;

public class WithFruits extends IceCreamDecorator {
    public WithFruits(IceCream decoratedIceCream) {
        super(decoratedIceCream);
    }

    @Override
    public void make() {
        decoratedIceCream.make();
        addFruits();
    }

    private void addFruits() {
        System.out.println("Adding fruits.");
    }
}
