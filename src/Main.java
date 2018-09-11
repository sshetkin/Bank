import Bank.Banks;
import Bank.BanksFactory;
import colector.Colector;
import people.PeopleFactory;
import people.Peoplе;

public class Main {
    public static void main(String []args){

        Colector colector = new Colector();

        Banks banks1 = new Banks("bank1", 0.02, 5, colector);
        Banks alfa = BanksFactory.createBank("Alfa", 0.5, 10, colector);
        Banks lombard = BanksFactory.createLombard("Lombard", 1, 3, colector);

        Peoplе vasja = new Peoplе("Vasja", 200);
        Peoplе petya = new Peoplе("Petya", 0);
        Peoplе major = PeopleFactory.creatRichPeople("Major");
        Peoplе sen = PeopleFactory.creaPoorPeople("Sen");
        Peoplе kolja = PeopleFactory.creatPeople("Kolja", 300);

        banks1.giveCredit(vasja, 1000.00);
        banks1.giveCredit(petya, 2000);
        banks1.giveCredit(vasja, 1000);

        alfa.giveCredit(major, 10000.00);
        alfa.giveCredit(sen, 10000.00);
        alfa.giveCredit(kolja, 1000.00);
        lombard.giveCredit(major, 1000.00);
        lombard.giveCredit(sen, 1000.00);
        lombard.giveCredit(kolja, 1000.00);

        colector.printAll();
        //end
        //end2
    }
}
