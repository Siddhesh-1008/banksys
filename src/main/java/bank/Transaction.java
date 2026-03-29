/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author Siddhesh
 */

import java.util.Date;

public class Transaction {
    Date date;
    String type;

    public Transaction(String type) {
        this.date = new Date();
        this.type = type;
    }

    public void printReceipt() {
        System.out.println("Transaction: " + type + " on " + date);
    }
}