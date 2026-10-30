import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String searchTerm;

        do {
            System.out.println("Eneter a search term (X or x to exit): ");
            searchTerm = scanner.nextLine();

            switch (searchTerm.toUpperCase()) {
                case "X" -> System.out.println("Goodbye!");

                default -> logAction("search : " + searchTerm);
            }

            } while (!searchTerm.equalsIgnoreCase("X"));

            logAction("exit");

    }


}



