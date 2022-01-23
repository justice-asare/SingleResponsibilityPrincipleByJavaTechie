package ocp;

public class EmailNotificationService implements NotificationService{
    @Override
    public void senOTP(String medium) {
        System.out.println("Implementing email notification api");
    }

    @Override
    public void sendTransactionReport(String medium) {
        System.out.println("Implementing email notification api");
    }
}
