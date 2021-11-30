import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();

        while (!"End".equals(destination)) {
            double target = Double.parseDouble(scanner.nextLine());
            double current = 0;

            while (current < target) {
                double money = Double.parseDouble(scanner.nextLine());
                current += money;
            }

            System.out.printf("Going to %scanner!%n", destination);
            destination = scanner.nextLine();
        }

    }
}
