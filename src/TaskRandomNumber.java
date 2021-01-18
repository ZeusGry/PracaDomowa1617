import java.util.Random;
import java.util.Scanner;

public class TaskRandomNumber {
    public static void randomMaxValue () {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj do jakiej wartości mam losować liczby:");
        int max = scan.nextInt();
        System.out.println(random.nextInt(max + 1));
    }

    public  static void randomMinAndMaxValue() {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj dolny zakres losowania liczb:");
        int min = scan.nextInt();
        System.out.println("Podaj górny zakres losowania liczb:");
        int max = scan.nextInt();
        System.out.println(random.nextInt(max-min+1) + min);
    }

    public static void randomMinAndMaxValueWithNegativeNumber() {
        randomMinAndMaxValue();
    }
}
