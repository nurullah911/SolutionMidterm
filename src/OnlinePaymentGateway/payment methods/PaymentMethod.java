package OnlinePaymentGateway;

public interface PaymentMethod {
    Transaction processPayment(double amount);
}
