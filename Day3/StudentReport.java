package Day3;

import java.util.*;

class StudentReport {
    public static HashMap<String, Integer> getReport(List<Student> studentList) {
        HashMap<String, Integer> report = new HashMap<>();
        for (Student s : studentList) {
            report.put(s.getLocation(), report.getOrDefault(s.getLocation(), 0) + 1);
        }
        return report;
    }
}
