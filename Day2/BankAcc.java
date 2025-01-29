package Day2;

import java.util.Scanner;

class Account {
    private int accountId;
    private String accountType;
    private int balance;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Balance amount after withdraw: " + balance);
            return true;
        } else {
            System.out.println("Sorry!!! No enough balance");
            return false;
        }
    }
}

class BankAcc {
    public Account getAccountDetails() {
        Scanner sc = new Scanner(System.in);
        Account acc = new Account();

        System.out.print("Enter account id: ");
        acc.setAccountId(sc.nextInt());
        sc.nextLine(); // Consume newline

        System.out.print("Enter account type: ");
        acc.setAccountType(sc.nextLine());

        int balance;
        do {
            System.out.print("Enter balance: ");
            balance = sc.nextInt();
            if (balance <= 0) System.out.println("Balance should be positive");
        } while (balance <= 0);
        acc.setBalance(balance);

        return acc;
    }

    public int getWithdrawAmount() {
        Scanner sc = new Scanner(System.in);

        int amount;
        do {
            System.out.print("Enter amount to be withdrawn: ");
            if (sc.hasNextInt()) {
                amount = sc.nextInt();
                if (amount <= 0) {
                    System.out.println("Amount should be positive");
                } else {
                    return amount;
                }
            } else {
                System.out.println("Please enter a valid integer.");
                sc.next(); // Consume invalid input
            }
        } while (true);
    }

    public static void main(String[] args) {
        BankAcc details = new BankAcc();
        Account account = details.getAccountDetails();
        int amount = details.getWithdrawAmount();
        account.withdraw(amount);
    }
}
