package Day5;

import java.util.*;

public class OptionalExample {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a name (or leave empty for null): ");
			String name = scanner.nextLine();
			
			Optional<String> optionalName = Optional.ofNullable(name);

			// Check if value is present, otherwise use default
			String result = optionalName.orElse("Unknown");
			System.out.println("Result: " + result);
		}
    }
}
