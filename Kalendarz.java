package zadaniaDomowe3Swiateczne;

import java.util.Scanner;

public class Kalendarz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Wpisz miesiąc i rok [MM YYYY]: ");
            String str = sc.nextLine();
            String[] inputMatrix = str.split(" ");
            try {
                int mm = Integer.parseInt(inputMatrix[0]);
                int rr = Integer.parseInt(inputMatrix[1]);
                new KalendarzProdukcja(mm, rr);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nie wpisałeś poprawnie daty, wprowadź ponownie.");
            }catch (Exception e) {
                System.out.println("Miesiac max 12, wprowadź ponownie.");
            }
            }
        }
    }



