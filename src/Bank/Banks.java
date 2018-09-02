package Bank;

import colector.Colector;
import credit.Credit;
import people.Peoplе;

import java.util.HashSet;
import java.util.Set;

public class Banks {
    private String nameBank;
    private Set<Peoplе>client = new HashSet<>();
    private double procent;
    private int countPayment;

    private Colector colector;

    public Banks(String nameBank, double procent, int countPayment, Colector colector) {
        this.nameBank = nameBank;
        this.procent = procent;
        this.countPayment = countPayment;
        this.colector = colector;
    }

    public Boolean giveCredit(Peoplе peoplе, double sumMoney){
        if (client.add(peoplе)){
            peoplе.addMoney(sumMoney);
            Credit credit = new Credit(sumMoney, procent, countPayment, peoplе, this);
            return true;
        }else {
            System.out.println(peoplе.getNamePeople() + " в кредите отказано");
             return false;
        }
    }

    public void deletCleent(Peoplе peoplе){
        client.remove(peoplе);
    }

    public void sellCredit(Credit credit){
        colector.buyCredit(credit);
        deletCleent(credit.getPeoplе());
    }

    @Override
    public String toString() {
        return nameBank;
    }
}
