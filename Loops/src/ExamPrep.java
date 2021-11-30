import java.util.Scanner;

public class ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxFailCount = Integer.parseInt(scanner.nextLine());

        int totalGradeScore = 0;
        int gradeCount = 0;
        String lastPro = "";

        String input = scanner.nextLine();

        int currentFailCount = 0;

        while (!input.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());

            totalGradeScore += grade;
            gradeCount++;
            lastPro = input;

            if (grade <= 4) {
                currentFailCount++;

                if (currentFailCount == maxFailCount) {
                    break;
                }

            }

            input = scanner.nextLine();

        }

        double avgScore = (double) totalGradeScore / gradeCount;

        if (input.equals("Enough")) {
            System.out.printf("Average score: %.2f%n" + "Number of problems: %d%n" + "Last problem: %s", avgScore,
                    gradeCount, lastPro);

        } else {
            System.out.printf("You need a break, %d poor grades.",
                    currentFailCount);
        }
    }
}
