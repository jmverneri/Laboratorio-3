package com.utn.Ej3;

public class Square extends Rectangle{

    public Square(){
        super(1.0, 1.0);
    }
    public Square(String color, double side){
        super(color, side, side);
    }

    @Override
    public String toString() {
        return "Cuadrado= Lado " + base + ", color: " + color;
    }
}
