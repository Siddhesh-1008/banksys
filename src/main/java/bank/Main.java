/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author Siddhesh
 */
public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("SBI", "Mumbai");

        Customer c = new Customer("Siddhesh", "999999", "sid@gmail.com");

        SavingsAccount sa = new SavingsAccount(101, "SBI", 5000, 0.05);

        c.deposit(sa, 1000);
        sa.addInterest();
        sa.showBalance();

        Withdraw w = new Withdraw(500);
        w.printReceipt();
    }
}