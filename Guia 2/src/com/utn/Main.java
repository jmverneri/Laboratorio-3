package com.utn;

import com.utn.ej1.Author;
import com.utn.ej1.Libro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	///Punto 1
        System.out.println("\n***Punto 1***\n");
        ///a)
        Author jos= new Author("Joshua", "Bloch", "joshua@email.com", 'M');

        ///b)
        System.out.println(jos);
        Author[] author= new Author[2];
        author[0]= jos;

        ///c)
        Libro effective= new Libro("Effective Java", 450, 150, author);

        ///d)
        System.out.println(effective);

        ///e)
        effective.setPrice(500);
        effective.setStock(effective.getStock() + 50);
        System.out.println(effective);

        ///f
        System.out.println("\n");
        System.out.println(Arrays.toString(effective.getAuthor()));

        ///h)
        Author sol= new Author("Soledad", "Barrera", "solemdp@gmail.com", 'F');
        author[1]= sol;
        Libro effective1= new Libro("Effective Java", 500, 200, author);
        System.out.println(effective1);

        System.out.println(effective1.printBook());


    }
}
