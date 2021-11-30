import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String answer = "The bigger number is: ";

        System.out.println("Please enter the first number:");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter the second number:");
        int secondNumber = Integer.parseInt(scanner.nextLine());

        if (firstNumber > secondNumber) {
            System.out.printf(answer + "%d", firstNumber);
        } else {
            System.out.printf(answer + "%d", secondNumber);
        }
    }
}
