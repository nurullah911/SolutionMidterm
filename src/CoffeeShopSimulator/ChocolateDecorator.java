package CoffeeShopSimulator;

public class ChocolateDecorator extends CoffeeDecorator {
    public ChocolateDecorator(Coffee coffee) {
        super(coffee);
    }
    public double getCost() {
        return super.getCost() + 0.6;
    }
    public String getDescription() {
        return super.getDescription() + ", Chocolate Syrup";
    }
}
