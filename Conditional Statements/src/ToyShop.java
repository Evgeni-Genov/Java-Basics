import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double trip = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dollCount = Integer.parseInt(scanner.nextLine());
        int bearsCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int trucksCount = Integer.parseInt(scanner.nextLine());

        double sum = puzzleCount * 2.60 + dollCount * 3
                + bearsCount * 4.10 + minionsCount * 8.20
                + trucksCount * 2;

        int toysCount = puzzleCount + dollCount
                + bearsCount + minionsCount
                + trucksCount;

        if (toysCount >= 50) {
            double discount = sum * 25 / 100;
            sum = sum - discount;
        }

        double rent = sum * 0.1;
        sum = sum - rent;

        double moneyLeft = sum - trip;

        if (moneyLeft >= 0) {
            System.out.printf("Yes! %.2f lv left.", moneyLeft);

        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(moneyLeft));
        }
    }
}
