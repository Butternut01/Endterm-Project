package com.company;

abstract class BasicAccount implements BankAccount {
    protected double balance;

    public BasicAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully.");
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

