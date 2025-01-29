package Day2;

import java.util.Scanner;

public class BankAccountAutomation {

    // Customer class with private attributes and constructor
    public static class Customer {
        private int customerId;
        private String customerName;
        private String emailId;

        // Constructor for Customer class
        public Customer(int customerId, String customerName, String emailId) {
            this.customerId = customerId;
            this.customerName = customerName;
            this.emailId = emailId;
        }

        public int getCustomerId() {
            return customerId;
        }

        public void setCustomerId(int customerId) {
            this.customerId = customerId;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public String getEmailId() {
            return emailId;
        }

        public void setEmailId(String emailId) {
            this.emailId = emailId;
        }
    }

    // Account class with abstract method
    public static abstract class Account {
        protected int accountNumber;
        protected Customer customerObj;
        protected double balance;

        // Constructor for Account class with the correct signature
        public Account(int accountNumber, Customer customerObj, double balance) {
            this.accountNumber = accountNumber;
            this.customerObj = customerObj;
            this.balance = balance;
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(int accountNumber) {
            this.accountNumber = accountNumber;
        }

        public Customer getCustomerObj() {
            return customerObj;
        }

        public void setCustomerObj(Customer customerObj) {
            this.customerObj = customerObj;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        // Abstract method for withdrawal
        public abstract boolean withdraw(double amount);
    }

    // SavingsAccount class inheriting Account class
    public static class SavingsAccount extends Account {
        private double minimumBalance;

        // Constructor for SavingsAccount class
        public SavingsAccount(int accountNumber, Customer customerObj, double balance, double minimumBalance) {
            super(accountNumber, customerObj, balance);
            this.minimumBalance = minimumBalance;
        }

        // Getter and Setter methods for minimumBalance
        public double getMinimumBalance() {
            return minimumBalance;
        }

        public void setMinimumBalance(double minimumBalance) {
            this.minimumBalance = minimumBalance;
        }

        // Implementing the withdraw method
        @Override
        public boolean withdraw(double amount) {
            if (balance - amount >= minimumBalance) {
                balance -= amount;
                System.out.printf("Rs. %.2f debited | Balance:  %.2f\n", amount, balance);
                return true;
            } else {
                System.out.println("Insufficient funds or below minimum balance.");
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input customer and account details
        System.out.print("Enter A/C number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter customer id: ");
        int customerId = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();
        System.out.print("Enter customer email: ");
        String emailId = sc.nextLine();
        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter minimum balance: ");
        double minimumBalance = sc.nextDouble();

        // Create customer and savings account
        Customer customer = new Customer(customerId, customerName, emailId);
        SavingsAccount savingsAccount = new SavingsAccount(accountNumber, customer, balance, minimumBalance);

        // Input withdrawal amount
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();

        // Perform withdrawal and check if successful
        savingsAccount.withdraw(withdrawAmount);

        sc.close();
    }
}
