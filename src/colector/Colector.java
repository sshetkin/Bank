package colector;

import Bank.Banks;
import credit.Credit;
import people.Peoplе;

import java.util.*;

public class Colector {
    //private List <Credit> listCredit = new ArrayList<>();
    private Map<Peoplе, Double> listCredit = new HashMap<>();

    public void buyCredit(Credit credit){

        if (listCredit.containsKey(credit.getPeoplе())) {
            Double tDolg = listCredit.get(credit.getPeoplе());
            tDolg += credit.getPeoplе().tecDolg(credit.getBanks());
            listCredit.put(credit.getPeoplе(), tDolg);
        }else listCredit.put(credit.getPeoplе(), credit.getPeoplе().tecDolg(credit.getBanks()));

        System.out.printf("Текущий долг клиента - %s составляет - %.2f %n",
                credit.getPeoplе().getNamePeople(), (double)listCredit.get(credit.getPeoplе()));

    }

    public void printAll(){
        for (Map.Entry<Peoplе, Double> item : listCredit.entrySet()){

           System.out.printf("Текущий долг клиента - %s составляет - %.2f %n",
                    item.getKey().getNamePeople(), (double)item.getValue());
        }

    }

}
