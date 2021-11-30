import java.util.Scanner;

public class From100To200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        if (num < 100) {
            System.out.println("The number is less than 100");
        } else if (num >= 100 && num <= 200) {
            System.out.println("The number is between 100 and 200");
        } else {
            System.out.println("The number is greater than 200");
        }
    }

}
