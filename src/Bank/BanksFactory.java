package Bank;

import colector.Colector;

public class BanksFactory {
    public static Banks createBank (String nameBank, double procent, int countPayment, Colector colector){
        return new Banks( nameBank, procent, countPayment, colector);
    }

    public static Banks createLombard (String nameBank, double procent, int countPayment, Colector colector){
        return new Banks( nameBank, procent, countPayment, colector);
    }
}
