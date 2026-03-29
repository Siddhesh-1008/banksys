/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author Siddhesh
 */
public class Customer {
    String name;
    String phone;
    String email;

    public Customer(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public void deposit(Account acc, double amt) {
        acc.deposit(amt);
    }

    public void withdraw(Account acc, double amt) {
        acc.withdraw(amt);
    }
}