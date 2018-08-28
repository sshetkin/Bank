package credit;

public class Credit {
    private double teloCredit;
    private double procent;
    private int countPayment;

    private double monthlyPayment;

    public Credit(double teloCredit, double procent, int countPayment) {
        this.teloCredit = teloCredit;
        this.procent = procent;
        this.countPayment = countPayment;
    }
}
