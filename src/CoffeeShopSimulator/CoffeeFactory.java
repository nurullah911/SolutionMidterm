package CoffeeShopSimulator;

public class CoffeeFactory {
    public static Coffee createCoffee(String type) {
        if (type.equalsIgnoreCase("espresso"))
            return new Espresso();
        else if (type.equalsIgnoreCase("cappuccino"))
            return new Cappuccino();
        else if (type.equalsIgnoreCase("latte"))
            return new Latte();
        else if (type.equalsIgnoreCase("americano"))
            return new Americano();
        else {
            System.out.println("what? here your espresso");
            return new Espresso();
        }
    }
}
