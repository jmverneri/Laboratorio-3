package com.utn.punto3;

public class ItemDeVenta {
    private int id;
    private String description;
    private int amount;
    private double unitePrice;
    private double totalPrice;

    public ItemDeVenta(){

    }
    public ItemDeVenta(int id, String description, int amount, double unitePrice){
        this.id= id;
        this.description= description;
        this.amount= amount;
        this.unitePrice= unitePrice;
        this.totalPrice= amount * unitePrice;
    }
    public int getId(){
        return id;
    }
    public String getDescription(){
        return description;
    }

    public int getAmount() {
        return amount;
    }

    public double getUnitePrice() {
        return unitePrice;
    }
    public double totalPrice(){
        return totalPrice;
    }

    @Override
    public String toString(){
        return "ItemVenta[id= " + this.id + " descripción= " + this.description + " cantidad= " + this.amount +
                " pUnitario= " + this.unitePrice + " pTotal= " + this.totalPrice + "]";
    }
}
