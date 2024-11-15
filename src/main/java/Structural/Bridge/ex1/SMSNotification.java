package Structural.Bridge.ex1;

// Concrete Implementor: SMS Notification
public class SMSNotification implements NotificationChannel {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

// Concrete Implementor: Email Notification
 class EmailNotification implements NotificationChannel {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending Email: " + message);
    }
}

// Concrete Implementor: Push Notification
 class PushNotification implements NotificationChannel {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending Push Notification: " + message);
    }
}
