package petle;

public class PetlaWhile {
    public static void pierwsze() {
        int i = 0;
        int wynik = 0;
        while (i <= 100) {
            wynik +=i++;
        }
        System.out.println(wynik);
    }

    public static void drugie() {
        int i = 1;
        long wynik = 1L;
        while (i <= 12) {
            wynik *=i++;
        }
        System.out.println(wynik);
    }
}
