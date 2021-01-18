package petle;

import java.util.Scanner;

public class PetlaDoWhile {
    public static void pierwsze() {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int liczba = scanner.nextInt();
        do {
            for (int i = 1; i < liczba; i++) {
                System.out.println(i);
            }
            System.out.println("Podaj koleją liczbę lub 0 by zakończyć");
        } while((liczba = scanner.nextInt()) > 0);
    }
    public static void drugie() {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Podaj liczbę którą mamy spierwiastkować:");
        int liczba = scanner.nextInt();
        do {
            System.out.println(Math.sqrt(liczba));
            System.out.println("Podaj koleją liczbę lub 0 by zakończyć");
        } while((liczba = scanner.nextInt()) > 0);
    }
}
