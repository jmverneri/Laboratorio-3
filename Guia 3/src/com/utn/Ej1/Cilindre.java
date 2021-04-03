package com.utn.Ej1;

public class Cilindre extends Circle{
    private double high= 1.0;

    public Cilindre(){
        super();
    }
    public Cilindre(double high){
        super();
        this.high= high;
    }
    public Cilindre(double high, double radio){
        super(radio);
        this.high= high;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

   @Override
    public double area() {
        return (2 * Math.PI * super.getRadio() * this.high) + (2 * super.area());
    }

    public double volume(){
        return (high * area());
    }

    @Override
    public String toString() {
        return "Cilindro {subclase de: " + super.toString() + "}, altura del cilindro: " + high  + ".";
    }
}
