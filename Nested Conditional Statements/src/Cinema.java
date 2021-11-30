import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int row = Integer.parseInt(scanner.nextLine());
        int column = Integer.parseInt(scanner.nextLine());

        double income = 0;

        if (projection.equals("Premiere")) {
            income = row * column * 12.00;

        } else if (projection.equals("Normal")) {
            income = row * column * 7.50;

        } else if (projection.equals("Discount")) {
            income = row * column * 5.00;
        }

        System.out.printf("%.2f leva", income);
    }
}
