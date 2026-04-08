/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banking_system;

/**
 *
 * @author Siddhesh
 */
public class Bank {
    public String bankName = "Global Bank";
    public String location = "Headquarters";
    public boolean authorizeAccount(String accountNum) {
        return true; // Simple simulation logic
    }
    public void manageTransaction() {
        System.out.println("Transaction is being processed by " + bankName);
    }
    
}
