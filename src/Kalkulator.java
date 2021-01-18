import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj rodzaj działania : *,+,-,/,%");
        String znak = scan.nextLine();
        System.out.println("Podaj pierwszą liczbę");
        int pierwszaLiczba = scan.nextInt();
        System.out.println("Podaj drugą liczbę");
        int drugaLiczba = scan.nextInt();
        System.out.println(pierwszaLiczba + znak + drugaLiczba + "=" + dzialanie(znak, pierwszaLiczba, drugaLiczba));
    }

    public static String dzialanie(String znak, int pierwszaLiczba, int drugaLiczba) {
        switch (znak) {
            case "*":
                return "" + (pierwszaLiczba * drugaLiczba);
            case "+":
                return "" + (pierwszaLiczba + drugaLiczba);
            case "-":
                return "" + (pierwszaLiczba - drugaLiczba);
            case "/":
                return drugaLiczba == 0 ? "Nie dziel przez zero" : "" + (pierwszaLiczba / drugaLiczba);
            case "%":
                return "" + (pierwszaLiczba % drugaLiczba);
            default:
                return "Nie rozpoznano znaku";
        }
    }
}
