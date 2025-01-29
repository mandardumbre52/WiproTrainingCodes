package Day2;

import java.util.Scanner;

//User-defined Exception
class InvalidSalaryException extends Exception {
 public InvalidSalaryException(String message) {
     super(message);
 }
}

//Candidate Class
class Candidate {
 private String name;
 private String gender;
 private double expectedSalary;

 // Constructor
 public Candidate(String name, String gender, double expectedSalary) {
     this.name = name;
     this.gender = gender;
     this.expectedSalary = expectedSalary;
 }

 // Getter Methods
 public String getName() {
     return name;
 }

 public String getGender() {
     return gender;
 }

 public double getExpectedSalary() {
     return expectedSalary;
 }
}

//Main Class
public class CandidateRegistration {
 public static Candidate getCandidateDetails() throws InvalidSalaryException {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Enter the candidate Details");
     System.out.print("Name: ");
     String name = scanner.nextLine();

     System.out.print("Gender: ");
     String gender = scanner.nextLine();

     System.out.print("Expected Salary: ");
     double expectedSalary = scanner.nextDouble();

     // Validate Salary
     if (expectedSalary < 10000) {
         throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
     }

     return new Candidate(name, gender, expectedSalary);
 }

 public static void main(String[] args) {
     try {
         Candidate candidate = getCandidateDetails();
         System.out.println("Registration Successful");
     } catch (InvalidSalaryException e) {
         System.out.println(e.getMessage());
     }
 }
}
