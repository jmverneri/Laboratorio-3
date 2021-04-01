package com.utn.ej3;

public class Account {
    private int id= 0;
    private double balance;
    private BankClient client;
    private String[] transactions= new String[10];

    public Account(BankClient client, double balance){
        this.id++;
        this.client= client;
        this.balance= balance;
    }
    public double deposit(double income){
        return balance+= income;
    }
    public double withdraw(double money){
        double substraction= this.balance - money;
        if(substraction >= -2000){
            balance-= money;
        }else{
            System.out.println("Saldo insuficiente");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", cliente: " + client + ", saldo: " + balance;
    }
}
