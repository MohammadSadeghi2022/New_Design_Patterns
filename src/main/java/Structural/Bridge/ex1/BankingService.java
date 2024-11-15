package Structural.Bridge.ex1;

// Abstraction
public abstract class BankingService {
    protected NotificationChannel channel;

    public BankingService(NotificationChannel channel) {
        this.channel = channel;
    }

    public abstract void sendNotification(String message);
}
