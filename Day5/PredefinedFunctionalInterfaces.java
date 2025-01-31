package Day5;

import java.util.*;
import java.util.function.*;

public class PredefinedFunctionalInterfaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Predicate
        System.out.print("Enter a number to check if it's even: ");
        int num = scanner.nextInt();
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(num));  // Output true or false based on input

        // Function
        System.out.print("Enter a string to get its length: ");
        String str = scanner.next();
        Function<String, Integer> stringLength = s -> s.length();
        System.out.println("Length of string: " + stringLength.apply(str));

        // Consumer
        System.out.print("Enter a message to print: ");
        scanner.nextLine();  // Consume newline character
        String message = scanner.nextLine();
        Consumer<String> print = s -> System.out.println(s);
        print.accept(message);  // Prints the message
    }
}
