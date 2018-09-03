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

        System.out.println("тек долг клиента - "+credit.getPeoplе().getNamePeople()
                +" состовляет - "+listCredit.get(credit.getPeoplе()));
    }

    public void printAll(){
        for (Map.Entry<Peoplе, Double> item : listCredit.entrySet()){
            System.out.println("тек долг клиента - "+item.getKey().getNamePeople()
                    +" состовляет - "+item.getValue());
        }

    }

}
