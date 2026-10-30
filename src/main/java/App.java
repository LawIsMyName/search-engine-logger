import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String searchTerm;

        logAction("launch");

        do {
            System.out.println("Enter a search term (X or x to exit): ");
            searchTerm = scanner.nextLine();

            switch (searchTerm.toUpperCase()) {
                case "X" -> System.out.println("Goodbye!");

                default -> logAction("search : " + searchTerm);
            }

        } while (!searchTerm.equalsIgnoreCase("X"));

        logAction("exit");

    }

    public static void logAction(String action) {

        LocalDateTime currentDate = LocalDateTime.now();

        String formattedDate = currentDate.format(
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        try {
            FileWriter writer = new FileWriter("logs.txt", true);

            // Write each action with a timestamp
            writer.write(formattedDate + " " + action + "\n");

            writer.close();

        } catch (IOException e) {
//            throw new RuntimeException(e);
        }


    }
}



