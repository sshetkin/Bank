package Bank;

import people.Peoplе;

import java.util.HashSet;
import java.util.Set;

public class Banks {
    private String nameBank;
    private Set<Peoplе>client = new HashSet<>();

    public Banks(String nameBank) {
        this.nameBank = nameBank;
    }

    public Boolean giveCredit(Peoplе peoplе){

        return false;

    }
}
