package main;
import java.util.Scanner;
import model.FinSafeAccount;
import exception.InsufficientFundsException;
public class FinSafeSpend{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter account holder name: ");
        String acc_username=sc.nextLine();
        System.out.print("Enter initial balance:");
        double acc_balance=sc.nextDouble();
        FinSafeAccount account=new FinSafeAccount(acc_username,acc_balance);
        System.out.println("Account created successfully!!");
        int choice;
        do {
            System.out.println("\nEnter your choice");
            System.out.println("\n1.Deposit 2.Withdraw 3.Balance 4. Transaction History 5.Exit");
            choice=sc.nextInt();

            try{
                switch(choice){

                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        account.deposit(sc.nextDouble());
                        break;

                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        account.processTransaction(sc.nextDouble());
                        break;

                    case 3:
                        account.showBalance();
                        break;

                    case 4:
                        account.printMiniStatement();
                        break;

                    case 5:
                        System.out.println("Thank you for using finsafe!!!");
                        break;

                    default:
                        System.out.println("Invalid choice");
                }

            } catch (InsufficientFundsException | IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (choice != 5);

        sc.close();
    }
}