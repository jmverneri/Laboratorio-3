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

}
