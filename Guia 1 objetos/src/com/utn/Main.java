package com.utn;

import com.utn.punto1.Rectangle;
import com.utn.punto2.Empleado;
import com.utn.punto3.ItemDeVenta;
import com.utn.punto4.CuentaBanco;
import com.utn.punto5.Hora;

public class Main {

    public static void main(String[] args) {
	    ///Punto 1
        System.out.println("\n******Punto 1******\n");
    	Rectangle rectangulo= new Rectangle(10, 25);
	    System.out.println("El alto del rectangulo es "+ rectangulo.getHigh());
	    System.out.println("El largo del rectangulo es "+ rectangulo.getBroad());

		System.out.println("El area del rectangulo es "+ rectangulo.area());
		System.out.println("El perimetro del rectangulo es "+ rectangulo.perimeter());

		rectangulo.setBroad(26.3);
		rectangulo.setHigh(15.4);

		System.out.println("El area del rectangulo es "+ rectangulo.area());
		System.out.println("El perimetro del rectangulo es "+ rectangulo.perimeter());

		Rectangle nuevoRectangulo= new Rectangle();
		System.out.println("El alto del rectangulo es "+ rectangulo.getHigh());
		System.out.println("El largo del rectangulo es "+ rectangulo.getBroad());

		///Punto 2
        System.out.println("\n******Punto 2******\n");
        Empleado carlos= new Empleado(23456345, "Carlos", "Gutiérrez", 25000);
		Empleado ana= new Empleado(34234123, "Ana", "Sánchez", 27500);


		System.out.println(carlos.getEmpleado());
		System.out.println(ana.getEmpleado());

		carlos.increaseSalary(15);
		System.out.println("El sueldo anual de " +carlos.getName() + " es " +carlos.getSalary());

		///Punto 3
        System.out.println("\n******Punto 3******\n");

        ItemDeVenta hacha= new ItemDeVenta(1, "hacha", 3, 1500);

        System.out.println(hacha);

        ///Punto 4
        System.out.println("\n******Punto 4******\n");

        CuentaBanco account= new CuentaBanco(1, "Javier", 15000);

        System.out.println("Se acreditaron en la cuenta: " +account.credito(2500));

        System.out.println("Se debitaron de la cuenta: " +account.debito(1500));

        account.debito(30000);

        System.out.println(account.getCuenta());

        ///Punto 5
        System.out.println("\n******Punto 5******\n");

        Hora hora= new Hora(23, 59, 23);

        System.out.println(hora);

        hora.backMinute();

        hora.forwardHour();

        hora.backSecond();

        System.out.println(hora);
    }
}
