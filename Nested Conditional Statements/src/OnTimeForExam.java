import java.util.Scanner;

public class OnTimeForExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer hourExam = Integer.parseInt(scan.nextLine());
        Integer minuteExam = Integer.parseInt(scan.nextLine());
        Integer hourArrive = Integer.parseInt(scan.nextLine());
        Integer minuteArrive = Integer.parseInt(scan.nextLine());

        int exam = hourExam * 60 + minuteExam;
        int arrive = hourArrive * 60 + minuteArrive;

        int time = 0;
        int hour = 0;
        int min = 0;

        if (exam < arrive) {
            System.out.println("Late");
            time = arrive - exam;

            if (time < 60) {
                System.out.printf("%d minutes after the start", time);
            }

            if (time >= 60) {
                hour = time / 60;
                min = time % 60;
                if (min < 10) {
                    System.out.printf("%d:0%d hours after the start",
                            hour, min);

                } else {
                    System.out.printf("%d:%d hours after the start",
                            hour, min);
                }
            }


        } else if (arrive <= exam && ((exam - arrive) <= 30)) {
            System.out.println("On time");
            time = exam - arrive;

            if (time != 0) {
                System.out.printf("%d minutes before the start", time);
            }

        } else if (arrive <= exam && ((exam - arrive) >= 30)) {
            System.out.println("Early");
            time = exam - arrive;

            if (time < 60) {
                System.out.printf("%d minutes before the start", time);
            }

            if (time >= 60) {
                hour = time / 60;
                min = time % 60;

                if (min < 10) {
                    System.out.printf("%d:0%d hours before the start",
                            hour, min);

                } else {
                    System.out.printf("%d:%d hours before the start",
                            hour, min);
                }
            }

        }
    }

}
