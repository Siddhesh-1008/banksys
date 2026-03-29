/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author Siddhesh
 */
public class CheckingAccount extends Account {
    double overdraftLimit;

    public CheckingAccount(int accNo, String bank, double balance, double limit) {
        super(accNo, bank, balance);
        this.overdraftLimit = limit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdraw with overdraft");
        } else {
            System.out.println("Limit exceeded");
        }
    }
}