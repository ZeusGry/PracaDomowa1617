import java.util.Scanner;

public class Statystyka {
    public static void stats() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj zadanie:");
        String text = scanner.nextLine();
        String[] arr = text.split(" ");
        int sumaLiter = 0;
        for (int i = 0; i < arr.length; i++) {
            sumaLiter += arr[i].length();
        }
        System.out.println("Ilość słów użytych w zadniu: " + arr.length);
        System.out.println("Średnia długość słowa: " + ((double) sumaLiter/arr.length));
    }
}
