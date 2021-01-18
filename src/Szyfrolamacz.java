import java.util.Random;
import java.util.Scanner;

public class Szyfrolamacz {
    private static int help = 0;
    private static int[] password() {
        Random random = new Random();
        int[] number = new int[4];
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(10);
        }
        return number;
    }

    private static int intPassword(int[] array) {
        int password = 0;
        for (int i = 0; i < array.length; i++) {
            password *= 10;
            password += array[i];
        }
        return password;
    }

    public static void szyfrolamaczStart() {
        int[] passwordArray = password();
        int number = intPassword(passwordArray);
        gameMethody(passwordArray, number);
    }

    private static void gameMethody(int[] array, int password) {
        Scanner scanner= new Scanner(System.in);
        int answer;
        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj kod:");
            answer = scanner.nextInt();
            if (answer == password) {
                System.out.println("Udało ci się złamać szyfr");
                return;
            } else if (answer > password) {
                System.out.println("Podany kod jest większy od hasła");
            } else {
                System.out.println("Podany kod jest mniejszy od hasła");
            }
            if (help == 0) {
                System.out.println("Czy chcesz ujawnić jedną liczbę kodu? Y/N");
                if (scanner.nextLine().equalsIgnoreCase("Y")) {
                    helper(array);
                }
            }
        }
        System.out.println("Nie udało ci się zgadnąć hasła, chcesz spróbować ponownie? Y/N");
        if (scanner.nextLine().equalsIgnoreCase("y")) {
            gameMethody(array, password);
        }
    }

    private static void helper(int[] array) {
        help++;
        Random random = new Random();
        int rng = random.nextInt(4);
        for (int i = 0; i < array.length; i++) {
            if (i == rng) {
                System.out.print(array[i]);
            } else {
                System.out.print("*");
            }
        }
        System.out.println();
    }

}
