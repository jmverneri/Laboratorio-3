package com.utn;

import com.utn.ej1.Author;
import com.utn.ej1.Book;
import com.utn.ej2.Bill;
import com.utn.ej2.Client;
import com.utn.ej2.SaleItem;

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
        Book effective= new Book("Effective Java", 450, 150, author);

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
        Book effective1= new Book("Effective Java", 500, 200, author);
        System.out.println(effective1);

        System.out.println(effective1.printBook());

    ///Punto 2
        System.out.println("\n***Punto 2***\n");
        ///b
        Client carlos= new Client("Carlos Gonzalez", "carlosgonzalez@gmail.com", 13.5);
        System.out.println(carlos);
        ///c
        ///Bill factura= new Bill(carlos, 5000);
        ///d
        ///System.out.println(factura);
        ///e
        SaleItem item= new SaleItem("computadora", "i7", 300000, 1);
        SaleItem item1= new SaleItem("impresora", "Brother", 25000, 3);
        SaleItem item2= new SaleItem("placa", "video", 15000, 2);
        SaleItem item3= new SaleItem("teclado", "konami", 1200, 1);

        SaleItem[] items= new SaleItem[4];
        items[0]= item;
        items[1]= item1;
        items[2]= item2;
        items[3]= item3;

       Bill factura= new Bill(carlos, items);
       System.out.println(factura);

    }
}
