package Day5;

import java.util.*;
import java.util.stream.*;

public class StreamAPIExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int count = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter the numbers:");
        for (int i = 0; i < count; i++) {
            numbers.add(scanner.nextInt());
        }

        // Using Stream API to filter even numbers
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);  // Print even numbers
    }
}
