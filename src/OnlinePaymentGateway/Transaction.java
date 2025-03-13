package OnlinePaymentGateway;
public class Transaction {
    private String type;
    private double amount;
    private String status;

    public Transaction(String type, double amount, String status) {
        this.type = type;
        this.amount = amount;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Transaction: " + type + " | Amount: " + amount + " | Status: " + status;
    }
}