import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int freeWidth = Integer.parseInt(scanner.nextLine());
        int freeLength = Integer.parseInt(scanner.nextLine());
        int freeHeight = Integer.parseInt(scanner.nextLine());

        int volume = freeWidth * freeLength * freeHeight;

        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            int boxes = Integer.parseInt(input);
            volume -= boxes;

            if (volume < 0) {
                break;
            }

            input = scanner.nextLine();
        }

        if (volume < 0) {
            int spaceNeeded = Math.abs(volume);
            System.out.printf("No more free space! You need %d Cubic meters more.",
                    spaceNeeded);

        } else {
            System.out.printf("%d Cubic meters left.", volume);
        }

    }
}
