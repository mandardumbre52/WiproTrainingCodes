package Day3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        
        while (true) {
            System.out.println("Enter Student’s Name, Location, Email and Mobile:");
            String name = sc.next();
            String location = sc.next();
            String email = sc.next();
            long mobile = sc.nextLong();
            
            students.add(new Student(name, location, email, mobile));

            System.out.println("Do you want to add more students [Y/N]:");
            char choice = sc.next().charAt(0);
            if (choice == 'N' || choice == 'n') break;
        }
        
        // Generate report
        HashMap<String, Integer> report = StudentReport.getReport(students);

        // Display report
        System.out.println("\nLocation\tCount");
        for (Map.Entry<String, Integer> entry : report.entrySet()) {
            System.out.println(entry.getKey() + "\t\t" + entry.getValue());
        }
        
        sc.close();
    }
}
