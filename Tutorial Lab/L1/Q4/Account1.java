package L1.Q4;

import java.util.Date;
import java.util.ArrayList;

public class Account1 {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private String name;
    private ArrayList<Transaction> transaction;

    public Account1() {
        this.name = "";
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
    };

    public Account1(String name,int id, double balance,double annualInterestRate){
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new Date();  
    }

    public Account1(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.transaction = new ArrayList<Transaction>();
    }

    public int getID() {
        return this.id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double rate) {
        this.annualInterestRate = rate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        if(amount > balance){
            throw new IllegalArgumentException("Insufficient Balance");
        }
        balance -= amount;
        transaction.add(new Transaction('W',amount,balance,"Withdrawal"));
    }

    public void deposit(double amount) {
        balance += amount;
        transaction.add(new Transaction('D',amount,balance,"Deposit"));
    }

    public ArrayList<Transaction> getTransactions() {
        return transaction;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", annualInterestRate=" + annualInterestRate +
                ", dateCreated=" + dateCreated +
                ", name='" + name + '\'' +
                '}';
    }

    public class Transaction {
        private Date date;
        private char type;
        private double amount;
        private double balance = 0;
        private String description;

        public Transaction(char type, double amount, double balance, String description) {
            this.type = type;
            this.amount = amount;
            this.balance = balance;
            this.description = description;
            this.date = new Date();
        }

        public char getType() {
            return type;
        }

        public double getAmount() {
            return amount;
        }

        public double getBalance() {
            return balance;
        }

        public String getDescription() {
            return description;
        }

        public Date getDate() {
            return date;
        }

        @Override
        public String toString() {
            return "Transaction:\n" +
                    "type=" + type +
                    ", amount=" + amount +
                    ", balance=" + balance +
                    ", description='" + description + '\'' +
                    ", date=" + date;
        }

    }

    public static void main(String[] args) {
        Account1 account = new Account1("George",1122,1000);
        account.setAnnualInterestRate(1.5);
        account.deposit(30);
        account.deposit(40);
        account.deposit(50);

        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

        System.out.println("Account Holder Name: " + account.getName());
        System.out.println("Interest Rate: " + account.getAnnualInterestRate() + "%");
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Transactions:");
        for (Transaction transaction : account.getTransactions()) {
            System.out.println(transaction);
        }
        System.out.println();
    }

}
