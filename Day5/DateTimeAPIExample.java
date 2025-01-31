package Day5;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimeAPIExample {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			// Date-time input
			System.out.print("Enter a custom date (yyyy-MM-dd): ");
			String inputDate = scanner.nextLine();
			LocalDate date = LocalDate.parse(inputDate);

			// Display the current time
			LocalTime time = LocalTime.now();

			// Format date-time
			LocalDateTime dateTime = LocalDateTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
			String formattedDateTime = dateTime.format(formatter);

			System.out.println("Entered Date: " + date);
			System.out.println("Current Time: " + time);
			System.out.println("Formatted DateTime: " + formattedDateTime);
		}
    }
}
