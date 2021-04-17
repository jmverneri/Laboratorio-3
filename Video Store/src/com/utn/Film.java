package com.utn;

import java.util.Date;

public class Film {
    private String title;
    private Date releaseDate;
    private int duration;
    private String audience;
    private String origin;
    private String description;
    private int quantity;

    public Film(){

    }

    public Film(String title, Date releaseDate, int duration, String audience, String origin,
            String description, int quantity){
        this.title= title;
        this.releaseDate= releaseDate;
        this.duration= duration;
        this.audience= audience;
        this.origin= origin;
        this.description= description;
        this.quantity= quantity;
    }

    public String getTitle(){
        return title;
    }
}
