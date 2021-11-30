import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        int holiday = Integer.parseInt(scanner.nextLine());
        int weekend = Integer.parseInt(scanner.nextLine());

        double weekendSofia = (48 - weekend) * (3.0 / 4.0);
        double holidayPlay = holiday * (2.0 / 3.0);
        double playedDays = weekendSofia + weekend + holidayPlay;

        if (year.equals("leap")) {
            holidayPlay = playedDays + (playedDays * 0.15);

            System.out.printf("%.0f", Math.floor(holidayPlay));

        } else if (year.equals("normal")) {
            System.out.printf("%.0f", Math.floor(playedDays));
        }
    }
}
