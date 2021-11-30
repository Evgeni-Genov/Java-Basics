import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String vacationType = "";
        double moneySpent = 0.0;

        if (budget <= 100) {
            destination = "Bulgaria";

            if (season.equals("summer")) {
                moneySpent = budget * 0.3;
                vacationType = "Camp";

            } else if (season.equals("winter")) {
                moneySpent = budget * 0.7;
                vacationType = "Hotel";

            }

        } else if (budget <= 1000) {
            destination = "Balkans";

            if (season.equals("summer")) {
                moneySpent = budget * 0.4;
                vacationType = "Camp";

            } else if (season.equals("winter")) {
                moneySpent = budget * 0.8;
                vacationType = "Hotel";
            }

        } else {
            destination = "Europe";
            moneySpent = budget * 0.9;
            vacationType = "Hotel";
        }

        System.out.printf("Somewhere in %s", destination);
        System.out.printf("%n%s - %.2f", vacationType, moneySpent);
    }
}
