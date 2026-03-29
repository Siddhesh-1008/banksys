/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author Siddhesh
 */
public class SavingsAccount extends Account {
    double interestRate;

    public SavingsAccount(int accNo, String bank, double balance, double rate) {
        super(accNo, bank, balance);
        this.interestRate = rate;
    }

    public void addInterest() {
        balance += balance * interestRate;
        System.out.println("Interest added");
    }
}