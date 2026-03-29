/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author Siddhesh
 */
public class ATM {
    int pinNo;
    String location;

    public ATM(int pinNo, String location) {
        this.pinNo = pinNo;
        this.location = location;
    }

    public boolean validate(int inputPin) {
        return this.pinNo == inputPin;
    }

    public void selectLanguage(String lang) {
        System.out.println("Language Selected: " + lang);
    }

    public void displayOptions() {
        System.out.println("1. Deposit\n2. Withdraw\n3. Balance");
    }
}
