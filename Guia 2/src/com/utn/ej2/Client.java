package com.utn.ej2;

import java.util.Random;
import java.util.UUID;

public class Client {
    private UUID id;
    private String name;
    private String email;
    private double percentage;

    public Client(){

    }
    public Client(String name, String email, double percentage) {
        this.id= UUID.randomUUID();
        this.name= name;
        this.email= email;
        this.percentage= percentage;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "\nID: " + id + ", nombre: " + name + ", email: " + email + ", descuento: " + percentage;
    }
}
