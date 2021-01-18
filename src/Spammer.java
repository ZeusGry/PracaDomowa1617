import java.util.Scanner;

public class Spammer {
    public static void echo (String slowo, int powtorzenia) {
        for (int i = 0; i < powtorzenia; i++) {
            System.out.println(slowo);
        }
    }

    public static void echo () {
        Scanner scanner = new Scanner(System.in);
        String slowo = scanner.nextLine();
        do {
            System.out.println(slowo);
        } while (!slowo.equals(""));
    }
}
