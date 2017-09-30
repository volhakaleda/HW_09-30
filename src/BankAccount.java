public class BankAccount {

    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int withdraw(int amount) {
        return balance - amount;
    }
    public int deposit(int amount) {
        return balance = balance + amount;
    }
    public int getbalance() {
        return balance;
    }
}
