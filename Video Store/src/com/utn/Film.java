package com.utn;

import java.time.LocalDate;
import java.util.Date;

public class Film {
    private String title;
    private LocalDate releaseDate;
    private Gender gender;
    private int duration;
    private String audience;
    private String origin;
    private String description;
    private int quantity;
    private Integer rentRecord= 0;

    public Film(){

    }

    public Film(String title, LocalDate releaseDate, int duration, String audience, String origin,
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

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    public Gender getGender() {
        return gender;
    }

    public String getAudience() {
        return audience;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public Integer getRentRecord() {
        return rentRecord;
    }

    public void setQuantity(int quantity){
        this.quantity= quantity;
    }

    @Override
    public String toString() {
        return "Pelicula= titulo: " + title + ", fecha de lanzamiento: " + releaseDate +
                ", duracion: " + duration + ", audiencia: " + audience + ", origen: "
                + origin + ", descripcion: " + description + ", stock: " + quantity + ".";
    }
}
