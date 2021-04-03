package com.utn.ej3;

public class Account {
    private int id= 0;
    private int movement;
    private double balance;
    private BankClient client;
    private String[] transactions= new String[10];

    public Account(BankClient client, double balance){
        this.id++;
        this.client= client;
        this.balance= balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public BankClient getClient() {
        return client;
    }

    public String[] getTransactions() {
        return transactions;
    }

    public double deposit(double income) {
        depositRegister(income);
        return balance += income;
    }
    public void depositRegister(double income){
        if(this.movement==10){
            this.movement= 0;
        }
        transactions[movement] = "El señor (" + client + ") deposito " + income + ".";
        System.out.println("\n");
        movement++;
    }
    public double withdraw(double money){
        double substraction= this.balance - money;
        if(substraction >= -2000){
            balance-= money;
            withdrawRegister(money);
        }else{
            System.out.println("Saldo insuficiente");
        }
        return balance;
    }
    public void withdrawRegister(double money){
        if(this.movement==10){
            this.movement= 0;
        }
        transactions[movement] = "\nEl señor (" + client + ") retiro " + money + ".";
        System.out.println("\n");
        movement++;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", cliente: " + client + ", saldo: " + balance;
    }
}
