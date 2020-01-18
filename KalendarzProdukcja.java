package zadaniaDomowe3Swiateczne;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class KalendarzProdukcja {

    public KalendarzProdukcja(int mm,  int rr) {

        LocalDate pierwszyDzienMiesiaca = LocalDate.of(rr, mm, 1);
        LocalDate pierwszyDzienMiesiacaNastepnego = pierwszyDzienMiesiaca.plusMonths(1);
        LocalDate ostatniDzienMiesiaca = pierwszyDzienMiesiacaNastepnego.plusDays(-1);
        DayOfWeek dzienTyg = pierwszyDzienMiesiaca.getDayOfWeek();

        int nrDzienTyg = dzienTyg.getValue();

        int dlugoscTablicy = ostatniDzienMiesiaca.getDayOfMonth() + nrDzienTyg;
        String[] tablica = new String[dlugoscTablicy];
        int n = 1;

        for (int x = 0; x < dlugoscTablicy; x++) {
            if (x < nrDzienTyg) {
                tablica[x] = "  ";
            } else {
                tablica[x] = String.format("%02d", n++);
            }
        }
//drukowanie kalendarza
        System.out.print("PN WT SR CZ PT SO ND");
        for (int x = 0; x < dlugoscTablicy; x++) {
            System.out.print(tablica[x] + " ");

            if (x % 7 == 0) {
                System.out.println("");
            }
        }
    }
}
