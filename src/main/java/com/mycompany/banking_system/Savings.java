/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banking_system;

/**
 *
 * @author Siddhesh
 */
public class Savings extends Account {
    public Savings(String accNum, double balance) {
        super(accNum, balance);
    }
    @Override
    public void cashWithdrawal(double amount) {
        this.balance -= amount;
    }
    @Override
    public void cashDeposit(double amount) {
        this.balance += amount;
    }
}