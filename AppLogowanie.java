package zadaniaDomowe3Swiateczne;

public class AppLogowanie {
    public static void main(String[] args) {
        Dane osoba = getOsoba();
        System.out.println(osoba.getImie());
    }

    public static Dane getOsoba() {
        return new Dane("Kinga", "Ryc", "kinryc", "123");
    }
    public static Dane getOsoba1() {
        return new Dane("Kinga1", "Ryc1", "kinryc1", "123");
    }
    public static Dane getOsoba2() {
        return new Dane("Kinga2", "Ryc2", "kinryc2", "123");
    }
}
