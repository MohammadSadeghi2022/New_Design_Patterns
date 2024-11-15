package Structural.Decorator.ex1;

public class AuditingDecorator extends BankAccountDecorator {


    public AuditingDecorator(BankAccount bankAccountDecoratoe) {
        super(bankAccountDecoratoe);

    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        auditTransaction(amount);
    }

    private void auditTransaction(double amount) {

        System.out.println("Audit Transaction:" + amount);
    }
}
