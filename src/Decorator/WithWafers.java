package Decorator;

public class WithWafers extends IceCreamDecorator {
    public WithWafers(IceCream decoratedIceCream) {
        super(decoratedIceCream);
    }

    @Override
    public void make() {
        decoratedIceCream.make();
        addWafers();
    }

    private void addWafers() {
        System.out.println("Adding wafers.");
    }
}