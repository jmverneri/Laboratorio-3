package com.utn;

import java.time.LocalDate;

public class Rental {
    private int id;
    private Film film;
    private Client client;
    private LocalDate retreatDay;
    private LocalDate returnDay;

    public Rental(Film film, Client client, LocalDate retreatDay){
        this.id= id++;
        this.film= film;
        this.client= client;
        this.retreatDay= retreatDay;
        this.returnDay= retreatDay.plusDays(2);
    }

    public int getId(){
        return id;
    }

    public Film getFilm() {
        return film;
    }

    public Client getClient() {
        return client;
    }

    public LocalDate getRetreatDay() {
        return retreatDay;
    }

    public LocalDate getReturnDay() {
        return returnDay;
    }

    @Override
    public String toString() {
        return "Alquiler= id: " + id + ", pelicula: " + film +
                ", cliente: " + client + ", fecha de alquiler: "
                + retreatDay + ", fecha de devolucion: " + returnDay + ".";
    }
}
