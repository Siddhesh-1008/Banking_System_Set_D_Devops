/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banking_system;

/**
 *
 * @author Siddhesh
 */
//public class ATM {
//    private int pin = 1234; // Default PIN for simulation
//    private String location = "Downtown Branch";
//    private String bankName = "Global Bank";
//    public boolean validatePin(int inputPin) {
//        return this.pin == inputPin;
//    }
//    public void selectLanguage(String language) {
//        System.out.println("Language set to: " + language);
//    }
//    public void displayOptions() {
//        System.out.println("\n1. Deposit");
//        System.out.println("2. Withdraw");
//        System.out.println("3. Balance");
//    }
//    
//}


public class ATM {
    private final int VALID_PIN = 1234;   // you can change this number

    public boolean validatePin(int pin) {
        return pin == VALID_PIN;
    }

    public void displayOptions() {
        System.out.println("=== ATM MENU ===");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Balance");
        System.out.println("4. Exit");
    }
}
