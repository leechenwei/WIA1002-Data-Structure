package T1;

interface Account{
    int deposit(int amount);
    boolean withdraw(int amount);
}

public class BankAccount implements Account{
    private int balance;

    public BankAccount(int initialBalance){
        this.balance = initialBalance;
    }

    public int deposit(int amount){
        this.balance += amount;
        return this.balance;
    }

    public boolean withdraw(int amount){
        if(amount <= this.balance){
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }

}