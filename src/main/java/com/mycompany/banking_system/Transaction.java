/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banking_system;
import java.util.Date;
/**
 *
 * @author Siddhesh
 */
public class Transaction {
    protected Date date;
    protected String type;
    protected double amount;
    public void printReceipt() {
        System.out.println("Receipt printed for " + type + " of " + amount);
    }
}
