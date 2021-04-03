package com.utn.Ej1;

public class Circle {
    private double radio= 1.0;
    private String color= "Rojo";

    public Circle(){

    }
    public Circle(double radio){
        this.radio= radio;
    }
    public Circle(double radio, String color){
        this.radio= radio;
        this.color= color;
    }

    public double getRadio() {
        return radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double area(){
        return Math.PI* (Math.pow(radio, 2));
    }

    @Override
    public String toString() {
        return "El circulo es de color: " + color + ", tiene un radio de " +
                radio + " cms.";
    }
}
