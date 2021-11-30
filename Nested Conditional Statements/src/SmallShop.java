import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        Double pieces = Double.parseDouble(scanner.nextLine());

        if (product.equals("coffee")) {

            if (town.equals("Sofia")) {
                pieces = pieces * 0.5;
                System.out.println(pieces);

            } else if (town.equals("Plovdiv")) {
                pieces = pieces * 0.4;
                System.out.println(pieces);

            } else if (town.equals("Varna")) {
                pieces = pieces * 0.45;
                System.out.println(pieces);
            }
        }

        if (product.equals("water")) {

            if (town.equals("Sofia")) {
                pieces = pieces * 0.8;
                System.out.println(pieces);

            } else if (town.equals("Plovdiv")) {
                pieces = pieces * 0.7;
                System.out.println(pieces);

            } else if (town.equals("Varna")) {
                pieces = pieces * 0.7;
                System.out.println(pieces);
            }
        }

        if (product.equals("beer")) {

            if (town.equals("Sofia")) {
                pieces = pieces * 1.2;
                System.out.println(pieces);

            } else if (town.equals("Plovdiv")) {
                pieces = pieces * 1.15;
                System.out.println(pieces);

            } else if (town.equals("Varna")) {
                pieces = pieces * 1.10;
                System.out.println(pieces);
            }
        }

        if (product.equals("sweets")) {

            if (town.equals("Sofia")) {
                pieces = pieces * 1.45;
                System.out.println(pieces);

            } else if (town.equals("Plovdiv")) {
                pieces = pieces * 1.3;
                System.out.println(pieces);

            } else if (town.equals("Varna")) {
                pieces = pieces * 1.35;
                System.out.println(pieces);
            }
        }

        if (product.equals("peanuts")) {

            if (town.equals("Sofia")) {
                pieces = pieces * 1.6;
                System.out.println(pieces);

            } else if (town.equals("Plovdiv")) {
                pieces = pieces * 1.5;
                System.out.println(pieces);

            } else if (town.equals("Varna")) {
                pieces = pieces * 1.55;
                System.out.println(pieces);
            }
        }

    }
}
