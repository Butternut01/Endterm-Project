package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        SavingsAccount savingsAccount = new SavingsAccount(0, 0.05);
        CheckingAccount checkingAccount = new CheckingAccount(0, 200);

        bank.addAccount(savingsAccount);
        bank.addAccount(checkingAccount);

        System.out.println("Welcome to the Bank!");
        System.out.println("Choose an option:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Display Balances");
        System.out.println("4. Exit");

        int choice;
        do {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account number (1 for Savings, 2 for Checking): ");
                    int accountNumber = scanner.nextInt();
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    if (accountNumber == 1) {
                        savingsAccount.deposit(depositAmount);
                    } else if (accountNumber == 2) {
                        checkingAccount.deposit(depositAmount);
                    } else {
                        System.out.println("Invalid account number.");
                    }
                    break;
                case 2:
                    System.out.print("Enter account number (1 for Savings, 2 for Checking): ");
                    int withdrawAccountNumber = scanner.nextInt();
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAccountNumber == 1) {
                        savingsAccount.withdraw(withdrawAmount);
                    } else if (withdrawAccountNumber == 2) {
                        checkingAccount.withdraw(withdrawAmount);
                    } else {
                        System.out.println("Invalid account number.");
                    }
                    break;
                case 3:
                    bank.displayAccounts();
                    break;
                case 4:
                    System.out.println("Thank you for banking with us!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
