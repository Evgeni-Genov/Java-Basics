import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum += num;

            if (num > max) {
                max = num;
            }
        }

        int sum_max_no = sum - max;

        if (max == sum_max_no) {
            System.out.println("Yes");
            System.out.printf("Sum = " + max);

        } else {
            int diff = Math.abs(max - sum_max_no);
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }


    }

}
