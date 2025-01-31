import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Which bank's card is this? [1. SBI | 2. ICICI]: ");
        int choice = scanner.nextInt();

        Bank bank;

        if (choice == 1) {
            System.out.println("========== WELCOME TO SBI ===========");
            bank = new SBI(); 
        } else if (choice == 2) {
            System.out.println("========== WELCOME TO ICICI ==========");
            bank = new ICICI(); 
        } else {
            System.out.println("Invalid Choice");
            scanner.close();
            return;
        }

        float amount;

        do {
            System.out.print("Enter transaction amount (minimum Rs." + Bank.MIN_TRANSACTION_AMOUNT + "): ");
            amount = scanner.nextFloat();
        } while (amount < Bank.MIN_TRANSACTION_AMOUNT);

        System.out.print("Enter transaction type (D - Deposit, W - Withdraw): ");
        char transactionType = scanner.next().charAt(0);

        try {
            if (transactionType == 'D' || transactionType == 'd') {
                bank.deposit(amount);
            } else if (transactionType == 'W' || transactionType == 'w') {
                bank.withdraw(amount);
            } else {
                System.out.println("Invalid transaction type");
            }
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}