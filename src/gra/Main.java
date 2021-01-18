package gra;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę poziomu:");
        String nazwa = scanner.nextLine();
        System.out.println("Podaj ilość potworów:");
        int iloscPotworow = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj poziom trudności");
        for (PoziomTrudnosci trudnosc: PoziomTrudnosci.values()) {
            System.out.println(trudnosc.toString().toLowerCase());
        }
        PoziomTrudnosci poziomTrudnosci = PoziomTrudnosci.valueOf(scanner.nextLine().toUpperCase());
        System.out.println("Podaj długość poziomu:");
        int dlugoscPoziomu = scanner.nextInt();
        System.out.println("Podaj limit czasowy:");
        int limitCzasu = scanner.nextInt();
        System.out.println("Podaj punkty za przejście:");
        int punktyZaPrzejscie = scanner.nextInt();
        PoziomGry gra = new PoziomGry(nazwa, iloscPotworow, poziomTrudnosci, dlugoscPoziomu, limitCzasu, punktyZaPrzejscie);
        System.out.println(gra);

    }
}
