import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goal = 10000;
        int allSteps = 0;


        while (allSteps < goal) {
            String goHome = scanner.nextLine();

            if (goHome.equals("Going home")) {
                int steps = Integer.parseInt(scanner.nextLine());
                allSteps += steps;

                break;

            }

            int steps = Integer.parseInt(goHome);
            allSteps += steps;

            if (allSteps >= goal) {
                break;
            }

        }
        if (allSteps >= goal) {
            System.out.println("Goal reached! Good job!");

        } else {
            int diff = goal - allSteps;

            System.out.printf("%d more steps to reach goal.",
                    diff);

        }

    }
}
