package Day2;

//Vehicle.java
public class Vehicle implements Loan, Insurance {
 private String vehicleNumber;
 private String modelName;
 private String vehicleType;
 private double price;

 // Constructor
 public Vehicle(String vehicleNumber, String modelName, String vehicleType, double price) {
     this.vehicleNumber = vehicleNumber;
     this.modelName = modelName;
     this.vehicleType = vehicleType;
     this.price = price;
 }

 // Getter methods
 public String getVehicleNumber() {
     return vehicleNumber;
 }

 public String getModelName() {
     return modelName;
 }

 public String getVehicleType() {
     return vehicleType;
 }

 public double getPrice() {
     return price;
 }

 // Implementing issueLoan method from Loan interface
 @Override
 public double issueLoan() {
     double loanAmount = 0;
     switch(vehicleType.toLowerCase()) {
         case "4 wheeler":
             loanAmount = 0.80 * price; // 80% loan for 4-wheeler
             break;
         case "3 wheeler":
             loanAmount = 0.75 * price; // 75% loan for 3-wheeler
             break;
         case "2 wheeler":
             loanAmount = 0.50 * price; // 50% loan for 2-wheeler
             break;
         default:
             System.out.println("Invalid vehicle type.");
     }
     return loanAmount;
 }

 // Implementing takeInsurance method from Insurance interface
 @Override
 public double takeInsurance() {
     double insuranceAmount = 0;
     if(price <= 150000) {
         insuranceAmount = 3500; // Insurance for vehicles up to 1.5L
     } else if(price <= 300000) {
         insuranceAmount = 4000; // Insurance for vehicles between 1.5L and 3L
     } else {
         insuranceAmount = 5000; // Insurance for vehicles above 3L
     }
     return insuranceAmount;
 }
}

