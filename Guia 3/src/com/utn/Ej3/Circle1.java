package com.utn.Ej3;

public class Circle1 extends Figure{
    private double radio;
    private double diameter;

    public Circle1(){

    }

    public Circle1(String color, double radio, double diameter){
        super(color);
        this.radio= radio;
        this.diameter= diameter;
    }

    public double getRadio() {
        return radio;
    }

    public double getDiameter(){
        return diameter;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setDiameter(double diameter){

    }

    @Override
    public double perimeter() {
        return Math.PI * diameter;
    }

    @Override
    public double area(){
        return Math.PI* (Math.pow(radio, 2));
    }

    @Override
    public String toString() {
        return "Circulo= radio " + radio + ", diametro " + diameter +
                ", color " + color;
    }
}
