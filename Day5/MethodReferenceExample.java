package Day5;

import java.util.*;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int count = scanner.nextInt();
        scanner.nextLine();  // Consume newline character

        List<String> names = new ArrayList<>();
        System.out.println("Enter the names:");
        for (int i = 0; i < count; i++) {
            names.add(scanner.nextLine());
        }

        // Using method reference to print names
        names.forEach(System.out::println);
    }
}
