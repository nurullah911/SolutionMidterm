package OnlinePaymentGateway;

public class ExternalPayPalAPI {
    public boolean makePayment(double amount) {
        return amount < 1000;
    }
}