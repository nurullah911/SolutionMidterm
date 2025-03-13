package CoffeeShopSimulator;

public class CreamDecorator extends CoffeeDecorator {
    public CreamDecorator(Coffee coffee) {
        super(coffee);
    }
    public double getCost() {
        return super.getCost() + 0.8;
    }
    public String getDescription() {
        return super.getDescription() + ", Whipped Cream";
    }
}
