package zadaniaDomowe3Swiateczne;

public class Pracownik implements Zarabiajacy {

    private String imie;
    private String nazwisko;
    private String stanowisko;
    private int zarobki;

    public Pracownik(String imie, String nazwisko, String stanowisko, int zarobki) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
        this.zarobki = zarobki;
    }

    public String getImie() {
        return imie;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public String getStanowisko() {
        return stanowisko;
    }
    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }
    public int getZarobki() {
        return zarobki;
    }
    public void setZarobki(int zarobki) {
        this.zarobki = zarobki;
    }

    @Override
    public int getPodajRoczneZarobki() {
        return zarobki*12;
    }
}

