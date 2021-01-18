import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Wisielec {
    private static String[] password;
    private static boolean[] check;
    private static String[] arrayOfPasswords = new String[10];
    private static String[] answer;

    static {
        arrayOfPasswords[0] = "gepard";
        arrayOfPasswords[1] = "telewizor";
        arrayOfPasswords[2] = "komputer";
        arrayOfPasswords[3] = "koszula";
        arrayOfPasswords[4] = "kolacja";
        arrayOfPasswords[5] = "cyberpunk";
        arrayOfPasswords[6] = "deweloper";
        arrayOfPasswords[7] = "popcorn";
        arrayOfPasswords[8] = "czekolada";
        arrayOfPasswords[9] = "ziemia";
    }
    private static String randomizer() {
        Random random = new Random();
        return arrayOfPasswords[random.nextInt(10)];
    }


    private static void initiation(String haslo) {
        password = haslo.split("");
        check = new boolean[password.length];
        answer = new String[password.length];
        answer = new String[password.length];
        for (int i = 0; i < check.length; i++) {
            check[i] = false;
        }
    }

    public static void startGame() {
        System.out.println("Zagrajmy w wisielca.\nMasz 5 żyć\nMusisz podawać po jednej literze\nPodawsz więcej, przegrasz\nStracisz wszystkie życia, przegrasz");
        System.out.println("Czy chcesz podać własne hasło? Y/N");
        isUserPassword();
        gameMethod();
    }

    private static void isUserPassword() {
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Y")) {
            System.out.println("Podaj własne hasło:");
            initiation(scanner.nextLine());
        } else if (answer.equalsIgnoreCase("N")) {
            initiation(randomizer());
        } else {
            System.out.println("Nie wiem o co chodzi, wpisz Y/N");
            isUserPassword();
        }
    }

    private static String takeLetter() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static boolean isOneLetter(String letter) {
        return letter.length() == 1;
    }

    private static void gameMethod() {
        for (int i = 0; i < 5;) {
            String letter = takeLetter();
            if (!isOneLetter(letter)) {
                System.out.println("Podałeś za dużo liter, przegrałeś!");
                return;
            }
            if(!checkAnswer(letter)) {
                i++;
            }
            draw();
            if (isWin()) {
                System.out.println("Gratulację, udało ci się wygrać");
                return;
            }
        }
        System.out.println("Straciłeś wszystkie swoje życia, przegrałeś");
    }

    private static boolean checkAnswer(String answer) {
        boolean hit = false;
        for (int i = 0; i < check.length; i++) {
            if (answer.equalsIgnoreCase(password[i])) {
                check[i] = true;
                hit = true;
            }
        }
        return hit;
    }

    private static void draw() {
        for (int i = 0; i < check.length; i++) {
            if (check[i] == false) {
                System.out.print("*");
            } else {
                System.out.print(password[i]);
            }
        }
        System.out.println();
    }

    private  static boolean isWin() {
        for (int i = 0; i < check.length; i++) {
            if (check[i] == false) {
                return false;
            }
        }
        return true;
    }

}
