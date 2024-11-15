package Structural.Adapter.ex2;

public class PaymentDetails {

    private String accountNumber;
    private double amount;
    public PaymentDetails(String accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getAmount() {
        return amount;
    }
}
