/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banking_system;

/**
 *
 * @author Siddhesh
 */
//public class Checkings extends Account {
//    public Checkings(String accNum, double balance) {
//        super(accNum, balance);
//    }
//    @Override
//    public void cashWithdrawal(double amount) {
//        this.balance -= amount;
//    }
//    @Override
//    public void cashDeposit(double amount) {
//        this.balance += amount;
//    }
//}


public class Checkings extends Account {

    public Checkings(String accNum, double initialBalance) {
        super(accNum, initialBalance);
    }

    @Override
    public void cashDeposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited Rs." + amount);
    }

    @Override
    public void cashWithdrawal(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds – withdrawal cancelled.");
            return;
        }
        balance -= amount;
        System.out.println("Withdrew Rs." + amount);
    }
}
