/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banking_system;

/**
 *
 * @author Siddhesh
 */
public class Withdrawal extends Transaction {
    public Withdrawal(double amount) {
        this.type = "Withdrawal";
        this.amount = amount;
    }
}