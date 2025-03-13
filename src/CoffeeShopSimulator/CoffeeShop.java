package CoffeeShopSimulator;

import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome! Choose coffee: Espresso, Cappuccino, Latte, Americano");
        String baseType = sc.nextLine();
        Coffee coffee = CoffeeFactory.createCoffee(baseType);

        while (true) {
            System.out.println("You can add toppings: milk, caramel, whipped, chocolate. Write 'done' when you finish");
            String topping = sc.nextLine();
            if (topping.equalsIgnoreCase("done"))
                break;
            else if (topping.equalsIgnoreCase("milk"))
                coffee = new MilkDecorator(coffee);
            else if (topping.equalsIgnoreCase("caramel"))
                coffee = new CaramelDecorator(coffee);
            else if (topping.equalsIgnoreCase("whipped"))
                coffee = new CreamDecorator(coffee);
            else if (topping.equalsIgnoreCase("chocolate"))
                coffee = new ChocolateDecorator(coffee);
            else
                System.out.println("Unkown topping");
        }

        System.out.println("Your Coffee: " + coffee.getDescription());
        System.out.printf("Cost: $%.2f\n", coffee.getCost());
        sc.close();
    }
}
