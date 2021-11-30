import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int number = Integer.parseInt(scanner.nextLine());
        int i = 0;

        while (i < number) {

            int currentNumber = Integer.parseInt(scanner.nextLine());

            if (currentNumber > max) {
                max = currentNumber;
            }

            i++;
        }

        System.out.println(max);

    }
}
