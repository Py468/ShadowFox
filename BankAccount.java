public class bank {
    private double balance;
    private List<Transaction> transactionHistory;

    public bank(double initial Balance) {
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
    }

    public void deposit(double amount) {
        this.balance += amount;
        this.transactionHistory.add(new Transaction("Deposit", amount));
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            throw new InsufficientBalanceException();
        }
        this.balance -= amount;
        this.transactionHistory.add(new Transaction("Withdrawal", -amount));
    }

    public double getBalance() {
        return this.balance;
    }

    public List<Transaction> getTransactionHistory() {
        return this.transactionHistory;
    }
}

class Transaction {
    private String type;
    private double amount;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return this.type;
    }

    public double getAmount() {
        return this.amount;
    }
}

class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException() {
        super("Insufficient balance");
    }
}