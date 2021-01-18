import java.util.Scanner;

public class ArraysStatistic {

    public static void main(String[] args) {
        do {
            int[] tablica = createArray();
            drukujOpisTablicy(tablica);
        } while (isCountinue());
    }
    private static boolean isCountinue() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Czy chcesz kontynuować? tak/nie");
        String text =scan.nextLine();
        if (text.equals("tak")) {
            return true;
        } else if (text.equals("nie")) {
            return false;
        } else {
            System.out.println("Podano nieprawidłową odpowiedź, proszę wpisać ‘tak’ lub ‘nie’");
            return isCountinue();
        }
    }

    private static void drukujOpisTablicy(int[] tablica) {
        int min= tablica[0];
        int max= tablica[0];
        int sum= tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            sum +=tablica[i];
            if (tablica[i] < min) {
                min = tablica[i];
            }
            if (tablica[i] > max) {
                max = tablica[i];
            }
        }
        System.out.println("Min wartość wynosi: " + min);
        System.out.println("Max wartość wynosi: " + max);
        System.out.println("Średnia wartość wynosi: " + ((double) sum/ tablica.length));
        System.out.println("Ilość elementów: " + tablica.length);
    }

    private static int[] createArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę elementów tablicy");
        int size = scan.nextInt();
        int[] tab = new int[size];
        for (int i = 0; i < size; i++) {
            tab[i] = scan.nextInt();
        }
        return tab;
    }

}
