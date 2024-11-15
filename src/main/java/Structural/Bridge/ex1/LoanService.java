package Structural.Bridge.ex1;

// Refined Abstraction: Loan Service
public class LoanService extends BankingService {
    public LoanService(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Loan Service Notification:");
        channel.notifyUser(message);
    }
}

// Refined Abstraction: Account Service
class AccountService extends BankingService {
    public AccountService(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Account Service Notification:");
        channel.notifyUser(message);
    }
}
