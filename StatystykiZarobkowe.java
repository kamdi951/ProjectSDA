package zadaniaDomowe3Swiateczne;


import java.util.ArrayList;
import java.util.List;

public class StatystykiZarobkowe<T extends Zarabiajacy> {

    private List<T> zarabiajacy;

    public StatystykiZarobkowe(List<T> zarabiajacy) {
        zarabiajacy.sort(new PorownywaczZarobkow<>());
        this.zarabiajacy = zarabiajacy;
    }

    public static void main(String[] args) {
        List<String> listaImion = new ArrayList<>();     //musi być OBIEKT np.String, Integer, nie może być int,
        List<Integer> listaZarobkow = new ArrayList<>();

        Pracownik pracownik1 = new Pracownik("Jan", "Nowak", "Specjalista", 4000);
        listaZarobkow.add(pracownik1.getZarobki());
        listaImion.add(pracownik1.getImie());

        Pracownik pracownik2 = new Pracownik("Cezary", "Kowalski", "Inzynier", 5000);
        listaZarobkow.add(pracownik2.getZarobki());
        listaImion.add(pracownik2.getImie());

        Pracownik pracownik3 = new Pracownik("Marek", "Wisniewski", "Inspektor", 3000);
        listaZarobkow.add(pracownik3.getZarobki());
        listaImion.add(pracownik3.getImie());

        //zarabiajacyNajmniej(listaZarobkow, listaImion);

        int minID = 0;
        int maxID = 0;
        int minZarobki = listaZarobkow.get(0);
        int maxZarobki = listaZarobkow.get(0);

        for (int k = 0; k < listaImion.size(); k++) {
            if (listaZarobkow.get(k) < minZarobki) {
                minID = k;
            }
            if (listaZarobkow.get(k) > maxZarobki) {
                maxID = k;
            }
        }

        System.out.println("najmniej zarabiający Imię: " + listaImion.get(minID) + " zarabia " + listaZarobkow.get(minID));
        System.out.println("najwiecej zarabiający Imię: " + listaImion.get(maxID) + " zarabia " + listaZarobkow.get(maxID));
    }


//    public static int zarabiajacyNajmniej(ArrayList listaZarobkow, ArrayList listaImion) {
//        int minID = 0;
//        int maxID = 0;
//        int minZarobki = listaZarobkow.get(0);
//        int maxZarobki = listaZarobkow.get(0);
//
//        for (int k = 0; k < listaImion.size(); k++) {
//            if (listaZarobkow.get(k) < minZarobki) {
//                minID = k;
//            }
//            if (listaZarobkow.get(k) > maxZarobki) {
//                maxID = k;
//            }
//        }
//        return minID;
//        return maxID;
//
//
//    }
}
//        zarabiajacyNajmniej(tablicaZarobkow[n]);
//        TypGen<Integer> tg = new TypGen<>(10);
//        int x = tg.getObj();
//        System.out.println(x);
//        tg.pokazTyp();

//        TypGen<String> tg2 = new TypGen<>("tekst");
//        String str = tg2.getObj();
//        System.out.println(str);
//        tg2.pokazTyp();


//    class TypGen<T>{
//        T obj;
//        TypGen(T obj){
//            this.obj = obj;
//        }
//        void pokazTyp(){
//            System.out.println(obj.getClass().getName());
//        }
//
//        public T getObj() {
//            return obj;
//        }
//    }

