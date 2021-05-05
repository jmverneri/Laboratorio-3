package com.utn;

public class Order {
    private Product product;
    private Client client;
    private double kms;

    public Order(Product product, Client client, double kms){
        this.product= product;
        this.client= client;
        this.kms= kms;
    }

    public void setShipping(double kms) {

        this.shipping = kms * 100;
        if(client.getClass().equals(BusinessCostumer)){
            this.shipping= (this.shipping * 0.085);
        }
    }
}
