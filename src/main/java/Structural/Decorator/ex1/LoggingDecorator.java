package Structural.Decorator.ex1;

public class LoggingDecorator extends BankAccountDecorator {

    public LoggingDecorator(BankAccount bankAccountDecorator) {
        super(bankAccountDecorator);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        logTransaction(amount);
    }

    public void logTransaction(double amount) {
        System.out.println("Transaction amount : " + amount);

    }


}
