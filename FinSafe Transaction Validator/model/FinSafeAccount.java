package model;
import java.util.ArrayList;
import exception.InsufficientFundsException;
import logging.FileUtil;
public class FinSafeAccount{
    private String acc_Holdername;
    private double acc_balance;
    private ArrayList<Double> transactions;
    public FinSafeAccount(String name, double initialBalance) {
        this.acc_Holdername=name;
        this.acc_balance=initialBalance; 
        this.transactions=new ArrayList<>();
        FileUtil.log("Account created: " +name+ "  Balance: " +acc_balance);
    }  
    // Deposit 
    public void deposit(double amount) {
        validate(amount);

        acc_balance += amount;
        addTransaction(amount);

        FileUtil.log("Deposited: " + amount + "  Balance: " +acc_balance);
        System.out.println("Deposit successful!!");
    }

    // Withdraw (Spend)
    public void processTransaction(double amount) throws InsufficientFundsException{
        validate(amount);

        if (amount >acc_balance) {
            FileUtil.log("FAILED Withdrawal: " + amount + "Insufficient balance");
            throw new InsufficientFundsException("Insufficient balance!");
        }

        acc_balance-=amount;
        addTransaction(-amount);

        FileUtil.log("Withdrawn: " + amount + "  Balance: " +acc_balance);
        System.out.println("Withdrawal successful!!");
    }

    // Validation
    private void validate(double amount) {
        if (amount<=0) {
            FileUtil.log("FAILED Transaction: Invalid amount " +amount);
            throw new IllegalArgumentException("Amount must be greater than 0");
        }
    }

    // Maintains last 5 transactions
    private void addTransaction(double amount) {
        transactions.add(amount);
        if (transactions.size()>5){
            transactions.remove(0);
        }
    }

    public void showBalance() {
        System.out.println("Account Holder: " +acc_Holdername);
        System.out.printf("Current Balance: %.2f\n",acc_balance);
    }

    public void printMiniStatement() {
        System.out.println("\nLast 5 Transactions:");

        if (transactions.isEmpty()) {
            System.out.println("No transactions done yet.");
            return;
        }

        int i=1;
        for (double t:transactions) {
            if (t>0)
                System.out.println(i++ + ".Deposited: " + t);
            else
                System.out.println(i++ + ".Withdrawn: " + Math.abs(t));
        }
    }
}