package com.utn.Ej3;

public abstract class Figure {
    protected String color;
    protected boolean painted;

    public Figure(){

    }

    public Figure(String color, boolean painted){
        this.color= color;
        this.painted= painted;
    }
    public abstract double area();

    public abstract double perimeter();
}
