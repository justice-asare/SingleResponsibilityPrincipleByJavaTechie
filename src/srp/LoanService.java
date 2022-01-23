package srp;

public class LoanService {

    public void getLoanInterestInfo(String loanType) {
//        if(loanType.equals("homeLoan")) {
//            //do some job
//        }
        switch(loanType){
            case "homeLoan":
                System.out.println("Home loan requested");
                break;
            case "personalLoan":
                System.out.println("Personal loan requested");
                break;
            case "car":
                System.out.println("Car loan requested");
                break;
            default:
                System.out.println("Unknown loan requested");
        }
    }
}
