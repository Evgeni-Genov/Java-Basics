import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int piecesOfCake = width * height;

        String input = scanner.nextLine();

        while (!input.equals("STOP")) {
            int piecesTaken = Integer.parseInt(input);
            piecesOfCake -= piecesTaken;

            if (piecesOfCake < 0) {
                break;

            }

            input = scanner.nextLine();

        }

        if (piecesOfCake >= 0) {
            System.out.printf("%d pieces are left.",
                    piecesOfCake);

        } else {
            System.out.printf("No more cake left! You need %d pieces more.",
                    Math.abs(piecesOfCake));
        }

    }
}
