public class Patron {

    String name;
    int pocket;
    BankAccount bankAccount;

    public Patron (String name, int pocket, BankAccount bankAccount) {
        this.name = name;
        this.pocket = pocket;
        this.bankAccount = bankAccount;
    }

    public int put(int amount) {
        if (amount > pocket){
            System.out.println("not allowed");
        }
        return bankAccount.deposit(amount);
    }

    public int take(int amount){
        if (bankAccount.getbalance() - amount < 0) {
            System.out.println("not allowed");
        }
        return bankAccount.withdraw(amount);
    }
}

