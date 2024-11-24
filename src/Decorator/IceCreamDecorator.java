package Decorator;

public abstract class IceCreamDecorator implements IceCream {
    protected IceCream decoratedIceCream;

    public IceCreamDecorator(IceCream decoratedIceCream) {
        this.decoratedIceCream = decoratedIceCream;
    }

    @Override
    public void make() {
        decoratedIceCream.make();
    }
}