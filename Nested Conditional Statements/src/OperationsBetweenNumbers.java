import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String operation = scanner.nextLine();

        double sum = 0;

        switch (operation) {
            case "+":
                sum = num1 + num2;

                if (sum % 2 == 0) {
                    System.out.printf("%d %s %d = %.0f - even", num1, operation, num2, Math.floor(sum));

                } else {
                    System.out.printf("%d %s %d = %f - odd", num1, operation, num2, Math.floor(sum));
                }

                break;

            case "-":
                sum = num1 - num2;

                if (sum % 2 == 0) {
                    System.out.printf("%d %s %d = %.0f - even", num1, operation, num2, Math.floor(sum));

                } else {
                    System.out.printf("%d %s %d = %.0f - odd", num1, operation, num2, Math.floor(sum));
                }

                break;

            case "*":
                sum = num1 * num2;

                if (sum % 2 == 0) {
                    System.out.printf("%d %s %d = %.0f - even", num1, operation, num2, sum);

                } else {
                    System.out.printf("%d %s %d = %.0f - odd", num1, operation, num2, sum);
                }

                break;

            case "/":

                if (num2 != 0) {
                    sum = (double) num1 / num2;
                    System.out.printf("%d %s %d = %.2f", num1, operation, num2, sum);

                } else {
                    System.out.printf("Cannot divide %d by zero", num1);
                }

                break;

            case "%":

                if (num2 != 0) {
                    sum = num1 % num2;
                    System.out.printf("%d %s %d = %.0f", num1, operation, num2, Math.floor(sum));

                } else {
                    System.out.printf("Cannot divide %d by zero", num1);

                }
                break;

            default:
                break;

        }

    }
}
