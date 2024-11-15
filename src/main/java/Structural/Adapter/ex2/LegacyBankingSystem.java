package Structural.Adapter.ex2;

// Step 2: Create the legacy banking system that we need to adapt.
public class LegacyBankingSystem {
    void processPayment(String accountNumber, double amount) {
        System.out.println("Processing payment for account " + accountNumber + " with balance " + amount);
    }
}
