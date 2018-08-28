package people;

public class Peoplе {
    private String namePeople;
    private double sumMoney;

    public Peoplе(String namePeople, double sumMoney) {
        this.namePeople = namePeople;
        this.sumMoney = sumMoney;
    }

    public Peoplе(String namePeople) {

        this.namePeople = namePeople;
        this.sumMoney = 0;

    }

    public String getNamePeople() {
        return namePeople;
    }

    public double getSumMoney() {
        return sumMoney;
    }

    public boolean pay(double payment){

        if (sumMoney<payment){
            return false;

        }else {
            sumMoney = sumMoney - payment;
            return true;
        }
}
    public void addMoney(double money){
        sumMoney = sumMoney + money;
    }
}
