package OnlinePaymentGateway;

import java.util.Scanner;

public class PaymentFactory {
    public static PaymentMethod create(String type, Scanner sc) {
        if(type.equalsIgnoreCase("credit")) {
            System.out.print("Enter credit card number: ");
            return new CreditCardPayment(sc.nextLine());
        } else if(type.equalsIgnoreCase("paypal")) {
            System.out.print("Enter PayPal email: ");
            return new PayPalPaymentAdapter(sc.nextLine());
        } else if(type.equalsIgnoreCase("crypto")) {
            System.out.print("Enter crypto wallet address: ");
            return new CryptoPayment(sc.nextLine());
        } else {
            System.out.println("Unknown payment type.");
            return null;
        }
    }
}
