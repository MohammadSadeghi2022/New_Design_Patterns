package Structural.Decorator.ex1;

public class NotificationDecorator extends BankAccountDecorator {

    public NotificationDecorator(BankAccount decoratedAccount) {
        super(decoratedAccount);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        sendNotification(amount);
    }

    private void sendNotification(double amount) {
        System.out.println("Notification: Withdrawal of $" + amount + " was processed.");
    }
}
