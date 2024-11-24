package prototypeShape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }

    @Override
    public Shape clone() {
        return new Rectangle();
    }
}