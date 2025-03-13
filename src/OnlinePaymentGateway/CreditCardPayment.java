package OnlinePaymentGateway;

public class CreditCardPayment implements PaymentMethod {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Transaction processPayment(double amount) {
        if (amount <= 0) return new Transaction("Credit Card", amount, "FAILED");
        if (!cardNumber.startsWith("4")) return new Transaction("Credit Card", amount, "FAILED");
        return new Transaction("Credit Card", amount, "COMPLETED");
    }
}
