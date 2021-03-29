package com.utn.ej1;

import java.util.Arrays;

public class Libro {
    private String title;
    private double price;
    private int stock;
    private Author[] authors;

    public Libro(){

    }

    public Libro(String title, double price, int stock, Author[] autor) {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.authors= autor;
    }

    public void setTitle(String title) {

        this.title = title;
    }
    public String getTitle(){

        return title;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public double getPrice() {

        return price;
    }

    public void setStock(int stock) {

        this.stock = stock;
    }

    public int getStock() {

        return stock;
    }

    public Author[] getAuthor(){
        return this.authors;
    }

    ///g)
    public String printBook() {
        StringBuilder completeName= new StringBuilder();
        for(Author autor: authors){
            completeName.append(autor.getName());
            completeName.append(" ");
            completeName.append(autor.getSurname());
            completeName.append(", ");
        }
        return "El libro " + this.title + " de " + completeName + " se vende a " + this.price + " pesos.";
    }

    @Override
    public String toString() {
        return "Título : " + title +
                ", precio: " + price +
                ", stock: " + stock +
                ", " + Arrays.toString(this.authors);
    }
}
