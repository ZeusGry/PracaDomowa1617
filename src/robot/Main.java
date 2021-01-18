package robot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] polecenie;
        Robot johnny = new Robot("Johnny 5");
        do {
            dostepnePolecenia();
            stars();
            dostepneKomendy();
            stars();
            polecenie = scanner.nextLine().split(" ");
            komendy(polecenie, johnny);
            stars();
            stars();
            stars();
        } while (!polecenie[0].equalsIgnoreCase("exit"));
    }
    public static void stars() {
        System.out.println("***");
    }
    public static void dostepneKomendy() {
        System.out.println("Dostępne RUCHy:");
        for (int i = 0; i < RuchRobota.values().length; i++) {
            System.out.println(RuchRobota.values()[i]);
        }
    }

    public static void dostepnePolecenia() {
        System.out.println("Dostępne polecenia:\nruch RUCH\n" +
                "naladuj\n" +
                "wlacz\n" +
                "wylacz\n" +
                "exit by wyjść");
    }

    public static void komendy(String[] polecenie, Robot robot) {
        switch (polecenie[0]) {
            case "naladuj" :
                robot.wlaczRobota();
                break;
            case "wylacz":
                robot.wylaczRobota();
                break;
            case "wlacz":
                robot.wlaczRobota();
                break;
            case "ruch" :
                try {
                    robot.poruszRobotem(RuchRobota.valueOf(polecenie[1].toUpperCase()));
                } catch (IllegalArgumentException e) {
                    System.out.println("Nie rozpoznano polecenia");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Nie podano polecenia");
                }
                break;
            case "exit":
                if (robot.isOn()) {
                    robot.wylaczRobota();
                }
                System.out.println("Wyjście z programu");
                break;
            default:
                System.out.println("Nie rozpoznano komendy");
        }
    }
}
