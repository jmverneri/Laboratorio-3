package com.utn.Ej3;

public class Rectangle extends Figure{
    private double base;
    private double high;

    public Rectangle(){

    }

    public Rectangle(String color, boolean painted, double large, double high){
        super(color, painted);
        this.base = large;
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
}
