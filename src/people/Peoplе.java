package people;

import Bank.Banks;

import java.util.HashMap;
import java.util.Map;

public class Peoplе {
    private String namePeople;
    private double sumMoney;

    private Map<Banks, Double>dolg = new HashMap<>();

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

    public void addDolg (Banks banks, double credit){
        dolg.put(banks, credit);
    }

    public void decrisDolg (Banks banks, double sumPlateja){
        Double tDolg = tecDolg(banks);
        tDolg-=sumPlateja;
        dolg.put(banks, tDolg);
        System.out.printf("Текущий долг %s в банке - %s составляет - %.2f %n",
                namePeople, banks.toString(), (double)dolg.get(banks));
    }

    public double tecDolg (Banks banks){
        return dolg.get(banks);
    }

}
