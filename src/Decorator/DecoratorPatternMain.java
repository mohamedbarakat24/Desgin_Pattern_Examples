package Decorator;

public class DecoratorPatternMain {
    public static void main(String[] args) {


        IceCream simpleIceCream = new SimpleIceCream();

        // Simple Ice Cream
        System.out.println("Order 1:");
        simpleIceCream.make();
        System.out.println();
        //output
//        Order 1:
//        Making a simple ice cream.

        // Ice Cream with Wafers
        IceCream iceCreamWithWafers = new WithWafers(simpleIceCream);
        System.out.println("Order 2:");
        iceCreamWithWafers.make();
        System.out.println();
//        Order 2:
//        Making a simple ice cream.
//        Adding wafers.
//
// Ice Cream with Fruits
        IceCream iceCreamWithFruits = new WithFruits(simpleIceCream);
        System.out.println("Order 3:");
        iceCreamWithFruits.make();
        System.out.println();

        /*
        * Order 3:
        Making a simple ice cream.
        Adding fruits.
* */

        // Ice Cream with Nuts
        IceCream iceCreamWithNuts = new WithNuts(simpleIceCream);
        System.out.println("Order 4:");
        iceCreamWithNuts.make();
        System.out.println();
/*Order 4:
Making a simple ice cream.
Adding nuts.
*/
        // Ice Cream with all toppings
        IceCream fullyLoadedIceCream = new WithNuts(new WithFruits(new WithWafers(simpleIceCream)));
        System.out.println("Order 5:");
        fullyLoadedIceCream.make();
        /*
Order 5:
Making a simple ice cream.
Adding wafers.
Adding fruits.
Adding nuts.
*/
    }
}