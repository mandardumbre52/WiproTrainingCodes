interface Bank {
    int MIN_TRANSACTION_AMOUNT = 0; 

    void deposit(float amt);

    void withdraw(float amt) throws InsufficientFundsException;
} 