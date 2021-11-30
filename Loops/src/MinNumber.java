import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int number = Integer.parseInt(scanner.nextLine());
        int i = 0;

        while (i < number) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            if (currentNum < min) {
                min = currentNum;
            }

            i++;
        }

        System.out.println(min);

    }
}
