package com.company;
import java.util.ArrayList;
import java.util.List;
class Bank {
    private List<BankAccount> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void displayAccounts() {
        for (BankAccount account : accounts) {
            System.out.println("Balance: " + account.getBalance());
        }
    }
}