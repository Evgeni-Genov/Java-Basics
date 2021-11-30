import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        String fromWhat = scanner.nextLine();
        String toWhat = scanner.nextLine();

        if (fromWhat.equals("m") && toWhat.equals("mm")) {
            num = num * 1000;

            System.out.printf("%.3f", num);

        } else if (fromWhat.equals("m") && toWhat.equals("cm")) {
            num = num * 100;

            System.out.printf("%.3f", num);

        } else if (fromWhat.equals("cm") && toWhat.equals("m")) {
            num = num / 100;

            System.out.printf("%.3f", num);

        } else if (fromWhat.equals("cm") && toWhat.equals("mm")) {
            num = num * 10;

            System.out.printf("%.3f", num);

        } else if (fromWhat.equals("mm") && toWhat.equals("m")) {
            num = num / 1000;

            System.out.printf("%.3f", num);

        } else if (fromWhat.equals("mm") && toWhat.equals("cm")) {
            num = num / 10;

            System.out.printf("%.3f", num);

        }
    }
}
