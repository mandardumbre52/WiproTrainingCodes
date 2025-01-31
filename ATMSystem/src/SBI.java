public class SBI implements Bank {
    public void deposit(float amt) {
        if (amt < MIN_TRANSACTION_AMOUNT) {
            System.out.println("Invalid deposit amount. Minimum deposit is Rs." + MIN_TRANSACTION_AMOUNT);
            return;
        }
        System.out.println("Rs." + amt + " Credited to SBI Account");
    }

    public void withdraw(float amt) throws InsufficientFundsException {
        if (amt < MIN_TRANSACTION_AMOUNT) {
            System.out.println("Invalid withdrawal amount. Minimum withdrawal is Rs." + MIN_TRANSACTION_AMOUNT);
            return;
        }
        // Simulate checking available balance (not shown for simplicity)
        // ...
        System.out.println("Rs." + amt + " Debited from SBI Account");
    }
}