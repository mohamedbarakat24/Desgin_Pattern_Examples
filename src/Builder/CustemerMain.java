package Builder;

public class CustemerMain {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        // Order Coffee
        StarbucksBuilder coffeeBuilder = new CoffeeBuilder();
        waiter.setStarbucksBuilder(coffeeBuilder);
        waiter.constructStarbucks();
        Starbucks coffee = waiter.getStarbucksDrink();
        System.out.println(coffee);

        // Order Tea
        StarbucksBuilder teaBuilder = new TeaBuilder();
        waiter.setStarbucksBuilder(teaBuilder);
        waiter.constructStarbucks();
        Starbucks tea = waiter.getStarbucksDrink();
        System.out.println(tea);
    }
}