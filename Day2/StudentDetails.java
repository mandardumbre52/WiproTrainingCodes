package Day2;

import java.util.Scanner;

public class StudentDetails {
    private int studentId;
    private String studentName;
    private String studentAddress;
    private String collegeName;

    // Constructor for students from NIT
    public StudentDetails(int studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = "NIT";
    }

    // Constructor for students from other colleges
    public StudentDetails(int studentId, String studentName, String studentAddress, String collegeName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = collegeName;
    }

    // Getter methods
    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting student details from user
        System.out.print("Enter Student's Id: ");
        int studentId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Student's Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Student's Address: ");
        String studentAddress = scanner.nextLine();

        String collegeChoice;
        String collegeName = "";

        while (true) {
            System.out.print("Whether the student is from NIT(Yes/No): ");
            collegeChoice = scanner.nextLine().trim().toLowerCase();

            if (collegeChoice.equals("yes")) {
                // Create Student object for NIT
                StudentDetails student = new StudentDetails(studentId, studentName, studentAddress);
                printStudentDetails(student);
                break;
            } else if (collegeChoice.equals("no")) {
                // Get college name for non-NIT students
                System.out.print("Enter the college name: ");
                collegeName = scanner.nextLine();
                StudentDetails student = new StudentDetails(studentId, studentName, studentAddress, collegeName);
                printStudentDetails(student);
                break;
            } else {
                System.out.println("Wrong Input");
            }
        }

        scanner.close();
    }

    public static void printStudentDetails(StudentDetails student) {
        System.out.println("Student id: " + student.getStudentId());
        System.out.println("Student name: " + student.getStudentName());
        System.out.println("Address: " + student.getStudentAddress());
        System.out.println("College Name: " + student.getCollegeName());
    }
}
