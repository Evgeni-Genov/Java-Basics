import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int st = Integer.parseInt(s.nextLine());
        int e = Integer.parseInt(s.nextLine());

        for (int i = 1; i <= st; i++) {
            for (int j = 1; j <= st; j++) {
                for (char k = 'a'; k < 'a' + e; k++) {
                    for (char l = 'a'; l < 'a' + e; l++) {
                        for (int m = Math.max(i, j) + 1; m <= st; m++) {
                            System.out.printf("%d%d%c%c%d ", i, j, k, l, m);
                        }

                    }

                }

            }

        }

    }
}
