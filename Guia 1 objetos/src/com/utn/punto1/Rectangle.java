package com.utn.punto1;

public class Rectangle {
    private double broad= 1.0;
    private double high= 1.0;

    public Rectangle(){
    }
    public Rectangle(double high, double broad){
        this.high= high;
        this.broad= broad;
    }
    public void setBroad(double broad){
        this.broad= broad;
    }
    public double getBroad(){
        return this.broad;
    }
    public void setHigh(double high){
        this.high= high;
    }
    public double getHigh(){
        return this.high;
    }
    public double area(){
        return high * broad;
    }
    public double perimeter(){
        return 2 * (high + broad);
    }
}
