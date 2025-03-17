package OnlinePaymentGateway;

import java.util.Random;

public class CryptoPayment implements PaymentMethod {
    private String wallet;

    public CryptoPayment(String wallet) {
        this.wallet = wallet;
    }

    public Transaction processPayment(double amount) {
        if (amount <= 0) return new Transaction("Crypto", amount, "FAILED");
        boolean success = new Random().nextBoolean();
        return new Transaction("Crypto", amount, success ? "COMPLETED" : "FAILED");
    }
}
