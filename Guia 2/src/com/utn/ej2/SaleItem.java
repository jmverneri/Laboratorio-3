package com.utn.ej2;

public class SaleItem {
    public static int id;
    public String name;
    public String description;
    public double price;
    private int amount;

    public SaleItem(String name, String description, double price, int amount){
        this.id= getId();
        this.name= name;
        this.description= description;
        this.price= price;
        this.amount= amount;
    }
    public static int getId(){      ///No funciona para autoincrementar
        return ++id;                ///Muestra solo el ultimo ID en todos los productos
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getAmount() {
        return amount;
    }
    public double getTotalPrice(){
        return (price * (double)amount);
    }

    @Override
    public String toString() {
        return "\nId: " + id + ", nombre: " + name + ", descripcion: " + description + ", precio individual: "
                + price + ", cantidad: " + amount + ", precio total: " +  getTotalPrice();
    }
}
