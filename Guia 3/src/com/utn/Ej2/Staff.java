package com.utn.Ej2;

public class Staff extends Person{
    private double income;
    private String shift;

    public Staff(String dni, String name, String surname, String email, String adress, double income,
                 String shift){
        super(dni, name, surname, email, adress);
        this.income= income;
        this.shift= shift;
    }

    public double getIncome(){
        return income;
    }

    public String getShift(){
        return shift;
    }
}
