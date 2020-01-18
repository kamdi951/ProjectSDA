package zadaniaDomowe3Swiateczne;

import java.util.Comparator;

public class PorownywaczZarobkow<T extends Zarabiajacy> implements Comparator<T> {

    @Override
    public int compare(T t, T t1) {
        double z1 = t.getPodajRoczneZarobki();
        double z2 = t1.getPodajRoczneZarobki();
        if (z1<z2){
            return -1;
        }else if (z1>z2){
            return 1;
        }else {
            return 0;
        }
    }
}
