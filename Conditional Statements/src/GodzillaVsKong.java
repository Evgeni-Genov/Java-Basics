import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int person = Integer.parseInt(scanner.nextLine());
        double personOutfit = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.1;
        double totalOutfitPrice = person * personOutfit;

        if (person > 150) {
            totalOutfitPrice = totalOutfitPrice - (totalOutfitPrice * 0.1);
        }

        double totalPrice = decor + totalOutfitPrice;

        if (totalPrice > budget) {
            System.out.println("Not enough money!");
            double diff = Math.abs(totalPrice - budget);

            System.out.printf("Wingard needs %.2f leva more.", diff);

        } else {
            System.out.println("Action!");
            double diff = Math.abs(totalPrice - budget);

            System.out.printf("Wingard starts filming with %.2f leva left.", diff);

        }

    }
}
