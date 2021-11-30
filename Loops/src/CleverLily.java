import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachine = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());

        int toysCount = 0;
        double lilyMoney = 0.0;
        double moneyBirthday = 10;

        for (int i = 1; i <= age; i++) {

            if (i % 2 == 0) {
                lilyMoney = lilyMoney + moneyBirthday - 1;
                moneyBirthday = moneyBirthday + 10;

            } else {
                toysCount++;

            }

        }

        double moneyFromToys = toysCount * priceToy;
        lilyMoney = lilyMoney + moneyFromToys;

        if (lilyMoney >= washingMachine) {
            double diff = lilyMoney - washingMachine;
            System.out.printf("Yes! %.2f", diff);

        } else {
            double moneyNeeded = washingMachine - lilyMoney;

            System.out.printf("No! %.2f", moneyNeeded);
        }

    }
}
