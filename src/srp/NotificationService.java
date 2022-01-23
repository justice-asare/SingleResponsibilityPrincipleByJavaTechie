package srp;

public class NotificationService {

    public void sendOTP(String medium){
        switch (medium){
            case "email":
                System.out.println("You requested for email notification");
                break;
            case "mobile":
                System.out.println("You requested for mobile notification");
                break;
            default:
                System.out.printf("You requested for unknown notification");
                break;
        }
    }
}
