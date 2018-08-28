package colector;

import Bank.Banks;
import credit.Credit;
import people.Peoplе;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Colector {
    private List <Credit> listCredit = new ArrayList<>();
    public void buyCredit(Credit credit){
        credit.getBanks().deletCleent(credit.getPeoplе());
        listCredit.add(credit);
    }

}
