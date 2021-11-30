import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());

        int totalDaysCount = 0;
        int daysSpent = 0;

        while (moneyNeeded > currentMoney) {
            String command = scanner.nextLine();
            double dayMoney = Double.parseDouble(scanner.nextLine());

            totalDaysCount++;

            if (command.equals("save")) {
                currentMoney += dayMoney;
                daysSpent = 0;

            } else if (command.equals("spend")) {
                currentMoney -= dayMoney;

                if (currentMoney < 0) {
                    currentMoney = 0;

                }

                daysSpent++;

            }

            if (daysSpent == 5) {
                break;
            }

        }
        if (moneyNeeded <= currentMoney) {
            System.out.printf("You saved the money for %d days.",
                    totalDaysCount);

        } else {
            System.out.println("You can't save the money.");
            System.out.printf("%d", totalDaysCount);
        }
    }
}
