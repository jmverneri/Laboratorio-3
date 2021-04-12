package com.utn.Ej3;

public abstract class Figure {
    protected String color= "Rojo";

    public Figure(){

    }

    public Figure(String color){
        this.color= color;
    }
    public abstract double area();

    public abstract double perimeter();
}
