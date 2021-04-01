package com.utn.ej2;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.UUID;
import com.utn.ej2.SaleItem;

public class Bill {
    private UUID id;
    private LocalDateTime date;
    private double cost;
    private Client client;
    private SaleItem[] item;

    public Bill(Client client, SaleItem[] item){
        this.id= UUID.randomUUID();
        this.date= LocalDateTime.now();
        this.client= client;
        ///this.cost= cost;
        this.item= item;
    }
    public UUID getId(){
        return id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public double getCost() {
        return cost;
    }
    public double getPartial(){
        double partial= 0.0;

        for(SaleItem sales : item) {
            if (sales != null) {
                partial += sales.getTotalPrice();
            }
        }
        return partial;
    }

    public double getTotal() {
        double total= 0.0;

        for(SaleItem sales : item){
            if(sales!= null){
                total+= sales.getTotalPrice();
            }
        }
        return total - (total * (client.getPercentage() / 100));
    }

    @Override
    public String toString() {
        return "ID: " + id + ", fecha: " + date + ", monto bruto: " + getPartial() + ", total con descuento: " + getTotal() +
                ",\n cliente: " + client + ",\n productos: " + Arrays.toString(item);
    }
}
