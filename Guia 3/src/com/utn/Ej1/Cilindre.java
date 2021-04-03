package com.utn.Ej1;

public class Cilindre extends Circle{
    private double high= 1.0;

    public Cilindre(){

    }
    public Cilindre(double high){
        this.high= high;
    }
    public Cilindre(double high, double radio){
        this.high= high;
        super.setRadio(radio);
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }
    public double volume(){
        return (high * Math.PI * Math.pow(getRadio(), 2));
    }
}
