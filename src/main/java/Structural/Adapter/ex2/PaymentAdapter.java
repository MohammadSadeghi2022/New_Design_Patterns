package Structural.Adapter.ex2;

// Step 4: Implement the Adapter class that adapts the old system to the new payment gateway.

//از سیستم جدید میخوایم دیتا رو به متد سیستم قدیمی پاس بدیم
public class PaymentAdapter implements PaymentGateway {

    LegacyBankingSystem legacyBankingSystem;

    public PaymentAdapter(LegacyBankingSystem legacyBankingSystem) {
        this.legacyBankingSystem = legacyBankingSystem;
    }

    @Override
    public void excuteTransaction(PaymentDetails paymentDetails) {
        String accountNumber = paymentDetails.getAccountNumber();
        Double amount = paymentDetails.getAmount();
        legacyBankingSystem.processPayment(accountNumber,amount);
    }
}
