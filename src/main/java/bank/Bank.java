/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author Siddhesh
 */
public class Bank {
    String bankName;
    String location;

    public Bank(String bankName, String location) {
        this.bankName = bankName;
        this.location = location;
    }

    public void manageTransactions() {
        System.out.println("Managing transactions...");
    }
}