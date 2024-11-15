package Structural.Decorator.ex1;

public abstract class BankAccountDecorator implements BankAccount {
    private BankAccount bankAccountDecorator;

    public BankAccountDecorator(BankAccount bankAccountDecorator) {
        this.bankAccountDecorator = bankAccountDecorator;
    }

    @Override
    public void withdraw(double amount) {
        bankAccountDecorator.withdraw(amount);
    }
}
