package org.example;

import java.util.Scanner;

public class BankAccount {
    private int accountNumber;
    private String name;
    private double balance;

    public BankAccount(int accountNumber, double balance, String name){
        setBalance(balance);
        setName(name);
        setAccountNumber(accountNumber);
    }

    public void newCustomer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter starting balance");
        double balance = Double.parseDouble(scanner.nextLine());
        int accountNum = makeAccountNumber();
    }

    public int makeAccountNumber(){
       return this.accountNumber = (int)(Math.random()*100);
    }
    public void deposit(double amount){
        this.setBalance(this.balance + amount);
    }

    public void withdrawal(double amount){
        this.setBalance(this.balance - amount);
    }

    public void details(){
        System.out.println(name + "'s account balance is: " + balance);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        if (name.equals(""))
            throw new IllegalArgumentException("Please enter a name");
        this.name = name;

    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}