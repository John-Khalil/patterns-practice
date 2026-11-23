import notifications.NotificationFactory;
import notifications.EmailNotificationFactory;
import notifications.SMSNotificationFactory;
import singleton.DatabaseConnection;
import builders.Computer;


public class Main {
    public static void main(String[] args) {

        //^ factory method
        // NotificationFactory factory;
        // factory = new EmailNotificationFactory();

        // factory.sendNotification("Welcome!");

        // factory = new SMSNotificationFactory();

        // factory.sendNotification("Your OTP is 123456");

        //^ Singleton

        // DatabaseConnection db1 = DatabaseConnection.getInstance();

        // DatabaseConnection db2 =  DatabaseConnection.getInstance();


        // db1.connect();

        // System.out.println(db1==db2);

        //^ Builder
        Computer pc = new Computer.Builder("I7",32)
                            .storage(1000)
                            .gpu("RTX")
                            .operatingSystem("WIN")
                            .build();
        pc.displaySpecs();


    }
}