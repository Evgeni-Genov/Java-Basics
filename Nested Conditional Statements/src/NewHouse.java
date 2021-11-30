import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int flowersCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;
        double discount = 1;
        double flowersPrice = 0;

        switch (flowers) {
            case "Roses":
                flowersPrice = 5;

                if (flowersCount > 80) {
                    discount = 0.9;
                }

                break;

            case "Dahlias":
                flowersPrice = 3.80;

                if (flowersCount > 90) {
                    discount = 0.85;
                }

                break;

            case "Tulips":
                flowersPrice = 2.80;

                if (flowersCount > 80) {
                    discount = 0.85;
                }

                break;

            case "Narcissus":
                flowersPrice = 3;

                if (flowersCount < 120) {
                    discount = 1.15;
                }

                break;

            case "Gladiolus":
                flowersPrice = 2.50;

                if (flowersCount < 80) {
                    discount = 1.20;
                }

                break;

            default:

                break;

        }

        totalPrice = (flowersCount * flowersPrice) * discount;

        if (totalPrice <= budget) {
            double money = budget - totalPrice;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",
                    flowersCount, flowers, money);

        } else {
            double diff = budget - totalPrice;
            System.out.printf("Not enough money, you need %.2f leva more.",
                    Math.abs(diff));
        }

    }
}
