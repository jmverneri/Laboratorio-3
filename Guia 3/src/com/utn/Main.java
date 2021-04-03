package com.utn;

import com.utn.Ej1.Cilindre;
import com.utn.Ej1.Circle;

public class Main {

    public static void main(String[] args) {
	/// 1
        System.out.println("\n***Punto 1***\n");
        ///a
        Cilindre cilindre= new Cilindre(3.0);
        System.out.println(cilindre.getRadio());
        System.out.println(cilindre.getHigh());
        System.out.println(cilindre.area());
        System.out.println(cilindre.volume());
        System.out.println("\n");

        ///b
        Cilindre cilindreb= new Cilindre(5.2, 1.2);
        System.out.println(cilindreb.getRadio());
        System.out.println(cilindreb.getHigh());
        System.out.println(cilindreb.area());
        System.out.println(cilindreb.volume());
        System.out.println("\n");

        ///c
        cilindreb.area();
        System.out.println(cilindreb.area());
        System.out.println(cilindreb.volume());

        System.out.println(cilindreb);

    }
}
