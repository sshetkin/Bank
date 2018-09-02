package people;

public class PeopleFactory {
    public static Peoplе creatPeople (String namePeople, double sumMoney){
        return new Peoplе(namePeople, sumMoney);
    }

    public static Peoplе creatRichPeople (String namePeople){
        return new Peoplе(namePeople, 10000);
    }
    public static Peoplе creaPoorPeople (String namePeople){
        return new Peoplе(namePeople, -1000);
    }
}
