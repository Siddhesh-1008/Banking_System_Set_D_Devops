/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banking_system;

/**
 *
 * @author Siddhesh
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner scanner = new Scanner(System.in);
       
        Checkings userAccount = new Checkings("ACC-7742", 2000.0);
        System.out.print("Enter PIN:- ");
        int inputPin = scanner.nextInt();
        if (atm.validatePin(inputPin)) {
            System.out.println("Access Granted");
            atm.displayOptions();
           
            System.out.println("\nProcessing Deposit of 450.0...");
            userAccount.cashDeposit(450.0);
            System.out.println("Processing Withdrawal of 1250.0...");
            userAccount.cashWithdrawal(1250.0);
            
            System.out.println("\nFinal Account Balance: " + userAccount.getBalance());
        } else {
            System.out.println("Error: Access Denied. Check your PIN credentials.");
        }
        
        scanner.close();
    }
}