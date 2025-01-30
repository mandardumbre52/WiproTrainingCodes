package Day3;

import java.util.*;

class LengthComparator implements Comparator<String> {
    public int compare(String s1, String s2) {
        if (s1.length() == s2.length()) {
            return s1.compareTo(s2); // Sort alphabetically if lengths are equal
        }
        return Integer.compare(s1.length(), s2.length()); // Sort by length
    }
}

public class StudentNamesSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> students = new TreeSet<>(new LengthComparator());

        System.out.print("How many students: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        int count = 0;
        while (count < n) {
            System.out.print("Enter student-" + (count + 1) + " name: ");
            String name = sc.nextLine();

            if (!students.add(name)) {
                System.out.println(name + " --- Note:--- should not be entered in collection");
            } else {
                count++;
            }

            // Stop asking if the limit is reached
            if (count < n) {
                System.out.print("Do you want to add more students [Y/N]: ");
                char choice = sc.next().charAt(0);
                sc.nextLine(); // Consume newline
                if (choice == 'N' || choice == 'n') break;
            }
        }

        // Display sorted student names
        System.out.println("\nSorted Student Names:");
        int index = 1;
        for (String name : students) {
            System.out.println(index++ + ". " + name);
        }

        sc.close();
    }
}

