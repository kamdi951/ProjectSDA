package zadaniaDomowe3Swiateczne;

public class Dane {

    private String imie;
    private String nazwisko;
    private String login;
    private String haslo;

    public Dane(String imie, String nazwisko, String login, String haslo) { //konstruktor tworzy obiekt
        this.imie = imie;       //this zmienne tej instancji
        this.nazwisko = nazwisko;
        this.login = login;
        this.haslo = haslo;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }
}
