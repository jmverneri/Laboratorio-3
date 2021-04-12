package com.utn.Ej3;

public class Rectangle extends Figure{
    protected double base;
    protected double high;

    public Rectangle(){

    }

    public Rectangle(double base, double high){
        this.base= base;
        this.high= high;
    }

    public Rectangle(String color, double base, double high){
        super(color);
        this.base = base;
        this.high= high;
    }

    public void setBase(double large){
        this.base = large;
    }

    public double getBase(){
        return base;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getHigh() {
        return high;
    }

    @Override
    public double area() {
        return (base * high);
    }

    @Override
    public double perimeter() {
        return ((2 * base) + (2 * high));
    }

    @Override
    public String toString() {
        return "Rectangulo= Base " + base + ", altura " + high +
                ", color " + color;
    }
}
