import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double averageGrade = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());
        double social=0;
        double excellent=0;


        if (income < minSalary && averageGrade > 4.5) {
            social = 0.35 * minSalary;

        }

        if (averageGrade >= 5.5) {
            excellent = 25 * averageGrade;

        }

        if (social == 0 && excellent == 0) {
            System.out.print("You cannot get a scholarship!");

        } else if (social >= excellent) {
            System.out.printf("You get a Social scholarship %.0f BGN",
                    Math.floor(social));

        } else {
            System.out.printf("You get a scholarship for excellent results %.0f BGN",
                    Math.floor(excellent));
        }
    }
}
