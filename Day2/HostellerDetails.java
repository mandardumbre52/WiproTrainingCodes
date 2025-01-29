package Day2;

import java.util.Scanner;

class Student {
    protected int studentId;
    protected String name;
    protected int departmentId;
    protected String gender;
    protected String phone;

    public void setDetails(int studentId, String name, int departmentId, String gender, String phone) {
        this.studentId = studentId;
        this.name = name;
        this.departmentId = departmentId;
        this.gender = gender.equalsIgnoreCase("M") ? "Male" : "Female";
        this.phone = phone;
    }
}

class Hosteller extends Student {
    private String hostelName;
    private int roomNumber;

    public void setHostellerDetails(String hostelName, int roomNumber) {
        this.hostelName = hostelName;
        this.roomNumber = roomNumber;
    }

    public void updateRoomNumber(int newRoomNumber) {
        this.roomNumber = newRoomNumber;
    }

    public void updatePhoneNumber(String newPhone) {
        this.phone = newPhone;
    }

    public void displayDetails() {
        System.out.println("The Student Details are as follows:\n");
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + name);
        System.out.println("Department ID: " + departmentId);
        System.out.println("Student Gender: " + gender);
        System.out.println("Phone Number: " + phone);
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Room No: " + roomNumber);
    }
}

public class HostellerDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input student and hosteller details
        System.out.println("Enter the Student Details & Hostel Details:");
        System.out.print("Student ID: ");
        int studentId = sc.nextInt();
        sc.nextLine();
        System.out.print("Student Name: ");
        String name = sc.nextLine();
        System.out.print("Department ID: ");
        int departmentId = sc.nextInt();
        sc.nextLine();
        System.out.print("Gender[M/F]: ");
        String gender = sc.nextLine();
        System.out.print("Phone Number: ");
        String phone = sc.nextLine();
        System.out.print("Hostel Name: ");
        String hostelName = sc.nextLine();
        System.out.print("Room Number: ");
        int roomNumber = sc.nextInt();

        // Create and set Hosteller details
        Hosteller hosteller = new Hosteller();
        hosteller.setDetails(studentId, name, departmentId, gender, phone);
        hosteller.setHostellerDetails(hostelName, roomNumber);

        // Modify room number if needed
        System.out.print("Modify Room Number(Y/N): ");
        sc.nextLine();
        if (sc.nextLine().equalsIgnoreCase("Y")) {
            System.out.print("New Room Number: ");
            int newRoomNumber = sc.nextInt();
            hosteller.updateRoomNumber(newRoomNumber);
        }

        // Modify phone number if needed
        System.out.print("Modify Phone Number(Y/N): ");
        sc.nextLine();
        if (sc.nextLine().equalsIgnoreCase("Y")) {
            System.out.print("New Phone Number: ");
            String newPhone = sc.nextLine();
            hosteller.updatePhoneNumber(newPhone);
        }

        // Display final details
        hosteller.displayDetails();
    }
}

