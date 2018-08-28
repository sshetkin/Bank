package credit;

import people.Peoplе;

public class Credit {
    private double teloCredit;
    private double procent;
    private int countPayment;
    private Peoplе peoplе;
    private double monthlyPayment;

    public Credit(double teloCredit, double procent, int countPayment, Peoplе peoplе) {
        this.teloCredit = teloCredit;
        this.procent = procent;
        this.countPayment = countPayment;
        this.peoplе = peoplе;

        monthlyPayment = (teloCredit + teloCredit*procent)/countPayment;

    }

    private void timer(){
        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();

        while (end - start<3000) {
            end = System.currentTimeMillis();
        }
    }

    private void getMonthPayment(){
        if (peoplе.pay(monthlyPayment)) {
            countPayment --;
        }else {
            //TODO
            //продать долг рейдеру
        }
    }
}
