package CoffeeShopSimulator;

public class CaramelDecorator extends CoffeeDecorator {
    public CaramelDecorator(Coffee coffee) {
        super(coffee);
    }
    public double getCost() {
        return super.getCost() + 0.7;
    }
    public String getDescription() {
        return super.getDescription() + ", Caramel Syrup";
    }
}
