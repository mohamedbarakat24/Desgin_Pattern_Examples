package Decorator;

public class SimpleIceCream implements IceCream {
    @Override
    public void make() {
        System.out.println("Making a simple ice cream.");
    }
}