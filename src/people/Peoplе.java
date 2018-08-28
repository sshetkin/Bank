package people;

public class Peoplе {
    private String namePeople;
    private double sumMoney;
    private double sumCredit;

    public Peoplе(String namePeople, double sumMoney, double sumCredit) {
        this.namePeople = namePeople;
        this.sumMoney = sumMoney;
        this.sumCredit = sumCredit;
    }

    public Peoplе(String namePeople) {

        this.namePeople = namePeople;
        this.sumMoney = 0;
        this.sumCredit = 0;

    }

    public boolean pay(double payment){

        if (sumMoney<payment){
            return false;
        }else {
            sumMoney = sumMoney - payment;
            return true;
        }
    }
}
