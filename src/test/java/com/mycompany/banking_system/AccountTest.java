/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banking_system;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    // Test Case 1: Valid Deposit
    @Test
    public void testValidDeposit() {
        Checkings account = new Checkings("ACC-100", 1000.0);
        account.cashDeposit(500.0);
        assertEquals(1500.0, account.getBalance(), "Balance should be 1500 after depositing 500");
    }

    // Test Case 2: Valid Withdrawal
    @Test
    public void testValidWithdrawal() {
        Checkings account = new Checkings("ACC-101", 1000.0);
        account.cashWithdrawal(300.0);
        assertEquals(700.0, account.getBalance(), "Balance should be 700 after withdrawing 300");
    }

    // Test Case 3: Invalid Withdrawal (Insufficient Funds)
    @Test
    public void testWithdrawalInsufficientFunds() {
        Checkings account = new Checkings("ACC-102", 500.0);
        account.cashWithdrawal(1000.0);
        assertEquals(500.0, account.getBalance(), "Balance should remain 500 due to insufficient funds");
    }

    // Test Case 4: Invalid Deposit (Negative Amount)
    @Test
    public void testNegativeDeposit() {
        Checkings account = new Checkings("ACC-103", 500.0);
        account.cashDeposit(-200.0);
        assertEquals(500.0, account.getBalance(), "Balance should remain 500 when attempting a negative deposit");
    }

    // Test Case 5: ATM PIN Validation
    @Test
    public void testAtmPinValidation() {
        ATM atm = new ATM();
        assertTrue(atm.validatePin(1234), "PIN 1234 should be validated as correct");
        assertFalse(atm.validatePin(9999), "PIN 9999 should be validated as incorrect");
    }
}
