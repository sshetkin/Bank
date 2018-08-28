import Bank.Banks;
import colector.Colector;
import people.Peoplе;

public class Main {
    public static void main(String []args){
        Colector colector = new Colector();

        Banks banks1 = new Banks("bank1", 0.02, 5, colector);
        Peoplе vasja = new Peoplе("Vasja", 200);
        Peoplе petya = new Peoplе("Petya", 0);


        banks1.giveCredit(vasja, 1000.00);
        banks1.giveCredit(petya, 2000);

        banks1.giveCredit(vasja, 1000);

    }
}
