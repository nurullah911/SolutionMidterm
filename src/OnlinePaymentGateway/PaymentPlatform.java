package OnlinePaymentGateway;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaymentPlatform {
    private static List<Transaction> history = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nChoose your payment type (credit, paypal, crypto) or type 'history'/'exit':");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("exit")) break;
            if (choice.equalsIgnoreCase("history")) {
                if (history.isEmpty()) {
                    System.out.println("History is empty");
                } else {
                    for (Transaction t : history) System.out.println(t);
                }
                continue;
            }
            PaymentMethod pm = PaymentFactory.create(choice, sc);
            if (pm == null) continue;
            System.out.print("Enter amount: ");
            double amt = 0;
            try {
                amt = Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid amount");
                continue;
            }
            Transaction tx = pm.processPayment(amt);
            history.add(tx);
            System.out.println(tx);
        }
        System.out.println("Exiting...");
    }
}