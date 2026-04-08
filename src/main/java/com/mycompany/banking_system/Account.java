/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banking_system;

/**
 *
 * @author Siddhesh
 */
public abstract class Account {
    protected String accountNumber;
    protected String bankName;
    protected double balance;
    public Account(String accNum, double initialBalance) {
        this.accountNumber = accNum;
        this.balance = initialBalance;
    }
    public abstract void cashWithdrawal(double amount);
    public abstract void cashDeposit(double amount);
    
    public double getBalance() {
        return balance;
    }
    public void miniStatement() {
        System.out.println("Generating statement for Account: " + accountNumber);
    }
    
}
