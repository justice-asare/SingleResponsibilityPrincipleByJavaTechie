package ocp;

public class MobileNotificationService implements NotificationService{

    @Override
    public void senOTP(String medium) {
        System.out.println("Implementing mobile notification api");
    }

    @Override
    public void sendTransactionReport(String medium) {
        System.out.println("Implementing mobile notification api");
    }
}
