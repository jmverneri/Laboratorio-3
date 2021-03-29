package com.utn.ej2;

import java.time.*;
import java.util.UUID;

public class Factura {
    private UUID id;
    private LocalDateTime date;
    private Client client;

    public Factura(UUID id,  LocalDateTime date, Client client){
        this.id= UUID.randomUUID();
        this.date= LocalDateTime.now();
        this.client= client;
    }
    public UUID getId(){
        return id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public double getTotal(double total, double percentage) {
        if(percentage>0){
            total= total - ((total*percentage/100));
        }
        return total;
    }
}
