import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num % 4 == 0) {
                p3++;
            }

            if (num % 3 == 0) {
                p2++;
            }

            if (num % 2 == 0) {
                p1++;
            }
        }

        double p1P = p1 / n * 100;
        double p2P = p2 / n * 100;
        double p3P = p3 / n * 100;

        System.out.printf("%.2f%%%n", p1P);
        System.out.printf("%.2f%%%n", p2P);
        System.out.printf("%.2f%%%n", p3P);

    }
}
