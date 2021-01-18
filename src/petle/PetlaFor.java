package petle;

import java.util.Scanner;

public class PetlaFor {
    public static void pierwsze() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int liczba = scan.nextInt();
        System.out.println("Podaj dzielnik");
        int dzielnik = scan.nextInt();
        for (int i = liczba-1; i > 0; i--) {
            if (liczba% dzielnik==0) {
                System.out.println(i);
            }
        }
    }

    public static void drugie() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int liczba = scan.nextInt();
        System.out.println("Do jakiej potęgi mamy ją podnieść?");
        int potega = scan.nextInt();
        int wynik = 1;
        for (int i = 0; i < potega; i++) {
            wynik *= liczba;
        }
        System.out.println("Wynik to: " + wynik);
    }
}
