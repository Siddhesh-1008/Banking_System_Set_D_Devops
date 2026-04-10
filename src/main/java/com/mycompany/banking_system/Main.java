package com.mycompany.banking_system;

// You can keep the import, but we won't use the scanner for the cloud run
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        
        System.out.println("--- Banking System Simulation ---");
        
        Checkings userAccount = new Checkings("ACC-7742", 2000.0);

        // --- CHANGE START ---
        // Instead of waiting for a user, we hardcode the PIN for the simulation
        int inputPin = 1234; 
        System.out.println("Simulating PIN entry: " + inputPin);
        // --- CHANGE END ---

        if (atm.validatePin(inputPin)) {
            System.out.println("Access Granted");
            atm.displayOptions();
            
            System.out.println("\nProcessing Deposit of 600.0...");
            userAccount.cashDeposit(600.0);
            
            System.out.println("Processing Withdrawals of 1250.0...");
            userAccount.cashWithdrawal(1250.0);
            
            System.out.println("\nFinal Account Balances : " + userAccount.getBalance());
        } else {
            System.out.println("Error: Access Denied. Check your PIN credentials....");
        }
        
        System.out.println("Simulation Completed.");
        System.out.flush(); // Ensure all output is printed before exit
        // Removed the infinite loop - app will now exit cleanly
        // System.out.println("App is staying alive for logs...");
        // while (true) {
        //     try {
        //         Thread.sleep(60000); // Sleep for 1 minute
        //     } catch (InterruptedException e) {
        //         break; 
        //     }
        // }
        
    }
}