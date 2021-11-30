import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogsCount = Integer.parseInt(scanner.nextLine());
        int animalsCount = Integer.parseInt(scanner.nextLine());

        double dogsFood = 2.50 * dogsCount;
        double animalsFood = 4.0 * animalsCount;
        double totalPrice = dogsFood + animalsFood;

        System.out.printf("%.2f lv.", totalPrice);

    }
}
