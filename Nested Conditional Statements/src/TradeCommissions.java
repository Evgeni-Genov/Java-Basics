import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        double procent = 0;

        if (town.equals("Sofia")) {

            if (sales >= 0 && sales <= 500) {
                procent = 0.05;

            } else if (sales > 500 && sales <= 1000) {
                procent = 0.07;

            } else if (sales > 1000 && sales <= 10000) {
                procent = 0.08;

            } else if (sales > 10000) {
                procent = 0.12;

            } else {
                System.out.println("error");
            }

        } else if (town.equals("Varna")) {

            if (sales >= 0 && sales <= 500) {
                procent = 0.045;

            } else if (sales > 500 && sales <= 1000) {
                procent = 0.075;

            } else if (sales > 1000 && sales <= 10000) {
                procent = 0.1;

            } else if (sales > 10000) {
                procent = 0.13;

            } else {
                System.out.println("error");
            }

        } else if (town.equals("Plovdiv")) {

            if (sales >= 0 && sales <= 500) {
                procent = 0.055;

            } else if (sales > 500 && sales <= 1000) {
                procent = 0.08;

            } else if (sales > 1000 && sales <= 10000) {
                procent = 0.12;

            } else if (sales > 10000) {
                procent = 0.145;

            } else {
                System.out.println("error");
            }

        } else {
            System.out.println("error");
        }

        if (procent > 0) {
            double commission = sales * procent;
            System.out.printf("%.2f", commission);

        } else {
            System.out.println("error");
        }
    }
}
