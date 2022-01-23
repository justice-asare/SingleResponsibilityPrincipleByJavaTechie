import lsp.solution.SocialMedia;
import lsp.solution.WhatsApp;
import ocp.WhatsAppNotificationService;
import srp.LoanService;

public class Main {
    public static void main(String[] args) {
        LoanService loanService = new LoanService();

        loanService.getLoanInterestInfo("personalLoan");

        WhatsAppNotificationService w1 = new WhatsAppNotificationService();
        w1.senOTP("Hello");

        SocialMedia socialMedia = new WhatsApp();
        socialMedia.chatWithFriend();
        WhatsApp whatsApp = new WhatsApp();
        whatsApp.sendPhotosAndVideos();

    }
}
