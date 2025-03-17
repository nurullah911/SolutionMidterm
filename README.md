Payment Gateway Simulator
Overview
This project demonstrates the use of the Factory Method and Adapter design patterns to build a flexible online payment gateway. The system supports multiple payment methods—including Credit Card, PayPal, and Cryptocurrency. Instead of hard-coding each payment method's instantiation and external API integration, the Factory Method encapsulates the creation of payment objects based on user input, while the Adapter pattern standardizes communication with an external PayPal API.

Why Factory Method and Adapter?
Factory Method:
Complex Object Creation: The payment gateway supports several payment methods, and using a single constructor for all cases would be cumbersome. The factory encapsulates this complexity by creating the correct payment method object on demand.
Readability: The creation logic is clear and modularized into intuitive methods, making the code easier to understand and maintain.
Adapter Pattern:
Integration with Legacy Systems: The adapter allows seamless integration with external or legacy APIs (e.g., PayPal), ensuring that external services conform to the internal PaymentMethod interface.
Flexibility: By decoupling the external API from the core logic, it becomes easier to update or swap out external services without affecting the system's overall design.
Additional Features:
Transaction Management: The project also includes transaction logging and basic error handling, which simulate a robust real-world payment processing workflow.

Coffee Shop Simulator
Overview
This project demonstrates the use of the Factory Method and Decorator design patterns in a coffee ordering system. Customers can select a base coffee from options such as Espresso, Cappuccino, Latte, or Americano using a factory. Then, they can dynamically add extra ingredients or toppings (like milk, caramel syrup, whipped cream, or chocolate syrup) through decorators, which modify both the final cost and description of the coffee.

Why Factory Method and Decorator?
Factory Method:
Simplified Creation: The factory handles the instantiation of various coffee base objects, making it straightforward to add new types of coffee without cluttering the code with multiple constructors.
Modularity: It cleanly separates the coffee creation logic from the rest of the system, which enhances maintainability.
Decorator Pattern:
Dynamic Customization: The decorator pattern allows you to add or remove extra ingredients to a coffee order dynamically. Each topping wraps the base coffee object and contributes additional cost and description.
Flexibility and Scalability: New ingredients can be added without modifying the core coffee classes, enabling a scalable and flexible ordering system.
Enhanced User Experience:
Customization: Customers can easily create their perfect coffee by selecting their base and choosing any combination of additional toppings.
Maintainability: The separation of concerns makes the code easy to extend and modify as new requirements arise.
