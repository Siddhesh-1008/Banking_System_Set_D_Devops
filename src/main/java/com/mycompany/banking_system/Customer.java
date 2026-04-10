/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banking_system;

/**
 *
 * @author Siddhesh
 */
public class Customer {
    public String name;
    public int phoneNumber;
    public String emailId;
    public String userId;
    public Customer(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }
    public void updateInformation(String email) {
        this.emailId = email;
    }
    public void depositOrWithdraw(int amount) {
        System.out.println("Customer Requesting Transaction of: " + amount);
        System.out.println("Ayushka Pathare done"); 
    }
}
