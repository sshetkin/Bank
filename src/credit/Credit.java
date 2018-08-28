package credit;

import Bank.Banks;
import people.Peoplе;

public class Credit {
    private double teloCredit;
    private double procent;
    private int countPayment;
    private Peoplе peoplе;
    private double monthlyPayment;
    private Banks banks;

    public Peoplе getPeoplе() {
        return peoplе;
    }

    public Banks getBanks() {
        return banks;
    }

    public Credit(double teloCredit, double procent, int countPayment, Peoplе peoplе, Banks banks) {
        this.teloCredit = teloCredit;
        this.procent = procent;
        this.countPayment = countPayment;
        this.peoplе = peoplе;
        this.banks = banks;

        monthlyPayment = (teloCredit + teloCredit*procent)/countPayment;
         timer();
    }

    private void timer(){
        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();

        while (end - start<3000) {
            end = System.currentTimeMillis();
        }
        getMonthPayment();
    }

    private void getMonthPayment(){
        if (peoplе.pay(monthlyPayment)) {
            countPayment --;
            if (countPayment > 0){
                timer();
            }else {
                System.out.println(peoplе.getNamePeople()+" - выплатил кредит!");
            }
        }else {
            //TODO
            //продать долг рейдеру
        }
    }
}
