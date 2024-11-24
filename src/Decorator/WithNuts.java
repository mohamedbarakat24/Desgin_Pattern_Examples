package Decorator;
public class WithNuts extends IceCreamDecorator {
    public WithNuts(IceCream decoratedIceCream) {
        super(decoratedIceCream);
    }

    @Override
    public void make() {
        decoratedIceCream.make();
        addNuts();
    }

    private void addNuts() {
        System.out.println("Adding nuts.");
    }
}