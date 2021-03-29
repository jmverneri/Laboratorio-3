package com.utn.punto4;

public class CuentaBanco {
    private int id;
    private String name;
    private double balance;

    public CuentaBanco(){

    }
    public CuentaBanco(int id, String name, double balance){
        this.id= id;
        this.name= name;
        this.balance= balance;
    }
    public void setId(int id){
        this.id= id;
    }
    public void setName(String name){
        this.name= name;
    }
    public void setBalance(int balance){
        this.balance= balance;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }
    public double credito(double dinero){
        this.balance= this.balance + dinero;
        return this.balance;
    }
    public double debito(double dinero){
        if(this.balance<dinero){
            System.out.println("Saldo insuficiente.");
        }else {
            this.balance= balance - dinero;
        }
        return this.balance;
    }
    public String getCuenta(){
        return "Los datos de la cuenta son: id: "+ getId() + ", Nombre: " + getName() + ", Balance: "
                + getBalance();
    }
}
