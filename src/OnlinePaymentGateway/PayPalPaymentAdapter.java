package OnlinePaymentGateway;

public class PayPalPaymentAdapter implements PaymentMethod {
    private ExternalPayPalAPI api = new ExternalPayPalAPI();
    private String email;

    public PayPalPaymentAdapter(String email) {
        this.email = email;
    }

    public Transaction processPayment(double amount) {
        if (amount <= 0) return new Transaction("PayPal", amount, "FAILED");
        boolean success = api.makePayment(amount);
        return new Transaction("PayPal", amount, success ? "COMPLETED" : "FAILED");
    }
}