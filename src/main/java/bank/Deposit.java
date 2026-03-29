/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author Siddhesh
 */
public class Deposit extends Transaction {
    double amount;

    public Deposit(double amount) {
        super("Deposit");
        this.amount = amount;
    }
}