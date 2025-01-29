package Day2;

//Main.java
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     // Get the details of the vehicle
     System.out.println("Enter vehicle number:");
     String vehicleNumber = scanner.nextLine();
     
     System.out.println("Enter model name:");
     String modelName = scanner.nextLine();
     
     System.out.println("Enter vehicle type (4 wheeler / 3 wheeler / 2 wheeler):");
     String vehicleType = scanner.nextLine();
     
     System.out.println("Enter the price of the vehicle:");
     double price = scanner.nextDouble();
     
     // Create Vehicle object
     Vehicle vehicle = new Vehicle(vehicleNumber, modelName, vehicleType, price);
     
     // Calculate and display loan amount
     double loanAmount = vehicle.issueLoan();
     if(loanAmount > 0) {
         System.out.println("Eligible Loan Amount: " + loanAmount);
     }
     
     // Calculate and display insurance amount
     double insuranceAmount = vehicle.takeInsurance();
     System.out.println("Insurance Amount: " + insuranceAmount);
 }
}
