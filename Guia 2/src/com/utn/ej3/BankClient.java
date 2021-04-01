package com.utn.ej3;

public class BankClient {
    private int id;
    private String name;
    private char gender;

    public BankClient(String name, char gender){
        this.id++;
        this.name= name;
        this.gender= gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", nombre y apellido: " + name + ", genero: " + gender;
    }
}
