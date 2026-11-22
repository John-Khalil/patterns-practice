import notifications.NotificationFactory;
import notifications.EmailNotificationFactory;
import notifications.SMSNotificationFactory;


public class Main {
    public static void main(String[] args) {
        NotificationFactory factory;
        factory = new EmailNotificationFactory();

        factory.sendNotification("Welcome!");

        factory = new SMSNotificationFactory();

        factory.sendNotification("Your OTP is 123456");

    }
}