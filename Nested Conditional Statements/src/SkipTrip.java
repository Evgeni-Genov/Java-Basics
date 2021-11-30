import java.util.Scanner;

public class SkipTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysCount = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String feedback = scanner.nextLine();

        int nightCnt = daysCount - 1;
        double price = 0;

        switch (roomType) {
            case "room for one person":
                price = 18;

                break;

            case "apartment":
                price = 25;

                if (nightCnt < 10) {
                    price *= 0.7;

                } else if (nightCnt < 15) {
                    price *= 0.65;

                } else {
                    price *= 0.5;
                }

                break;

            case "president apartment":
                price = 35;

                if (nightCnt < 10) {
                    price *= 0.9;

                } else if (nightCnt < 15) {
                    price *= 0.85;

                } else {
                    price *= 0.8;
                }

                break;

        }

        double total_price = price * nightCnt;

        if (feedback.equals("positive")) {
            total_price *= 1.25;

        } else {
            total_price *= 0.9;
        }

        System.out.printf("%.2f", total_price);
    }
}
