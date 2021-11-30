import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String favouriteBook = scanner.nextLine();
        int libraryCapacity = Integer.parseInt(scanner.nextLine());
        int bookCnt = 0;
        boolean isFound = true;

        String currentBook = scanner.nextLine();
        while (!currentBook.equals(favouriteBook)) {
            bookCnt++;

            if (bookCnt == libraryCapacity) {
                isFound = false;

                break;

            }

            currentBook = scanner.nextLine();
        }
        if (isFound) {
            System.out.printf("You checked %d books and found it.",
                    bookCnt);

        } else {
            System.out.printf("The book you search is not here!%n"
                    + "You checked %d books.", bookCnt);

        }

    }
}
