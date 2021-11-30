import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = Integer.parseInt(s.nextLine());

        for (int i = 1; i <= 9; i++) {
            if (n % i != 0) {
                continue;
            }

            for (int o = 1; o <= 9; o++) {

                if (n % o != 0) {
                    continue;
                }

                for (int p = 1; p <= 9; p++) {
                    if (n % p != 0) {
                        continue;
                    }

                    for (int a = 1; a <= 9; a++) {
                        if (n % a != 0) {
                            continue;
                        }

                        System.out.printf("%d%d%d%d ",
                                i, o, p, a);

                    }
                }
            }
        }
    }
}
