import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get today's date
        LocalDate today = LocalDate.now();

        // Ask user for future date input
        System.out.print("Enter future date (dd-MM-yyyy): ");
        String input = scanner.nextLine();

        // Parse future date using formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate futureDate = LocalDate.parse(input, formatter);

        // Calculate days left
        long daysLeft = ChronoUnit.DAYS.between(today, futureDate);

        // Output result
        if (daysLeft > 0) {
            System.out.println("⏳ Days left: " + daysLeft);
        } else if (daysLeft == 0) {
            System.out.println("📅 Today is the day!");
        } else {
            System.out.println("❗ That date has already passed.");
        }

        scanner.close();
    }
}
