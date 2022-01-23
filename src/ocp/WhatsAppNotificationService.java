package ocp;

public class WhatsAppNotificationService implements NotificationService{
    @Override
    public void senOTP(String medium) {
        System.out.println("Implementing whatsapp notification api is sending "+ medium);
    }

    @Override
    public void sendTransactionReport(String medium) {
        System.out.println("Implementing whatsapp notification api");
    }
}
