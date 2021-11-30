import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double avgGrade = 0.0;
        int gradeCnt = 0;

        while (gradeCnt < 12) {
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade >= 4) {
                avgGrade += grade;
                gradeCnt++;
            }
        }

        avgGrade /= gradeCnt;
        System.out.printf("%s graduated. Average grade: %.2f",
                name, avgGrade);

    }
}
