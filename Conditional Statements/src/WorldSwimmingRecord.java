import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordSeconds = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeForOneMeter = Double.parseDouble(scanner.nextLine());

        double wholeTimeWithoutResistance = distance * timeForOneMeter;
        double timeLostWithResistance = Math.floor((distance / 15)) * 12.5;
        double timeAllTogether = wholeTimeWithoutResistance + timeLostWithResistance;


        if (recordSeconds <= timeAllTogether) {
            double diff = Math.abs(recordSeconds - timeAllTogether);

            System.out.printf("No, he failed! He was %.2f seconds slower.", diff);

        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", timeAllTogether);

        }
    }

}
