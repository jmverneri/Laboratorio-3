package com.utn;

import com.utn.Ej1.Cilindre;
import com.utn.Ej1.Circle;
import com.utn.Ej2.*;
import com.utn.Ej3.Circle1;
import com.utn.Ej3.Rectangle;
import com.utn.Ej3.Square;

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

        /// 2
        System.out.println("\n***Punto 2***\n");
        //a
        Student jose= new Student("35214236", "Jose", "Manolo", "josemanolo@gmail.com",
                "Alberti 22", 2020, 5000.0, "Programacion");
        Student juan= new Student("35214226", "Juan", "Carlos", "juan_carlos@gmail.com",
                "Dorrego 55", 2019, 5000.0, "Programacion");
        Student rodrigo= new Student("41214236", "Rodrigo", "Perez", "rodrigoperez@gmail.com",
                "Almafuerte 547", 2011, 5000.0, "Diseño");
        Student maria= new Student("50214236", "Maria", "Ce", "mariace@gmail.com",
                "Aristobulo 41", 2020, 5000.0, "Programacion");
        ///b
        Staff ernesto= new Staff("22214236", "Ernesto", "Sanz", "ernestosanz@gmail.com",
                "Dorrego 1500", 36000, "Mañana");
        Staff santiago= new Staff("15214236", "Santiago", "Santino", "santiago@gmail.com",
                "Luro 1500", 36000, "Tarde");
        Staff facundo= new Staff("32214236", "Facundo", "Perez", "facu@gmail.com",
                "San Luis 2423", 36000, "Mañana");
        Staff ramon= new Staff("02214236", "Ramon", "Gomez", "ramon@gmail.com",
                "Libertad 88", 45000, "Tarde");
        ///c
        Person[] school= new Person[8];
        school[0]= jose;
        school[1]= juan;
        school[2]= rodrigo;
        school[3]= maria;
        school[4]= ernesto;
        school[5]= santiago;
        school[6]= facundo;
        school[7]= ramon;
        ///d
        System.out.println(jose instanceof Person);
        ///e
        int student= 0;
        int staff= 0;
        for(Person person: school){
            if(person!=null){
                if(person instanceof Student){
                    student++;
                }
                if(person instanceof Staff){
                    staff++;
                }
            }
        }
        System.out.println("En la escuela hay " + student + " estudiantes y " + staff + " docentes.");
        ///f
        double income= 0.0;
        for(Person person: school){
            if(person!=null){
                if(person instanceof Student){
                    income+= ((Student) person).getSchoolFee();
                }
            }
        }
        System.out.println("El total de ingresos de la escuela es: $ " + income + ".");

        /// 3
        System.out.println("\n***Punto 3***\n");

        Circle1 circle= new Circle1("Verde", 2.0, 1.5);
        double perimeter1= circle.perimeter();
        double area1= circle.area();
        System.out.println(circle);
        System.out.println("El circulo tiene un perimetro de " +perimeter1 +
                        " y un area de " + area1 + " centimetros");

        Rectangle rectangle1= new Rectangle("Amarillo", 5.2, 2.0);
        double perimeter2= rectangle1.perimeter();
        double area2= rectangle1.area();
        System.out.println(rectangle1);
        System.out.println("El rectangulo tiene un perimetro de " + perimeter2 + " y un area de " + area2 +
                " centrimetros.");

        Square square= new Square("Naranja", 2.5);
        System.out.println(square);
        System.out.println("El cuadrado tiene un perimetro de " + square.perimeter() +
                " y un area de " + square.area() + " centimetros.");

    }
}
