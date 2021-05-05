package com.utn;

import java.time.LocalDate;
import java.util.*;

public class VideoStore {
    private List<Film> filmsList = new ArrayList<>();
    private List<Client> clientsList = new ArrayList<>();
    private List<Rental> rentalsList = new ArrayList<>();

    public VideoStore(){

    }

    public VideoStore(List<Film> films, List<Client> clients, List<Rental> rentals){
        this.filmsList = films;
        this.clientsList = clients;
        this.rentalsList = rentals;
    }

    public List<Client> getClientsList() {
        return clientsList;
    }

    public void setClientsList(List<Client> clientsList) {
        this.clientsList = clientsList;
    }

    public List<Film> getFilms(){
        return filmsList;
    }

    public void setFilms(List<Film> films){
        this.filmsList = films;
    }

    public List<Rental> getRentalsList(){
        return rentalsList;
    }

    public void setRentalsList(List<Rental> rentalsList){
        this.rentalsList = rentalsList;
    }

    ///Films

    public void addFilm(Film film){
        filmsList.add(film);
    }

    public void removeFilm(String filming){
        Film film= filmsList.stream().filter(f-> f.getTitle().toUpperCase().contains(filming.toUpperCase()))
                .findFirst().orElse(null);
        if(film!=null){
            filmsList.remove(filming);
        }
    }

    public Film filmExistence(String name){
        Film answer= null;
        for(Film filming: filmsList){
            if(filming.getTitle().equalsIgnoreCase(name)){
                answer= filming;
            }
        }
        return answer;
    }

    public void showMovies(){
        for(Film film : filmsList){
            System.out.println(film);
        }
    }

    public void showFilmInfo(String title){
        Film film= filmsList.stream().filter(f-> f.getTitle().toUpperCase().contains(title.toUpperCase()))
                .findFirst().orElse(null);
        if(film!= null){
            System.out.println(film);
        }
    }

    ///Clients
    public void addClient(Client client){
        clientsList.add(client);
    }

    public void removeClient(String name){
        Client client= clientsList.stream().filter(f-> f.getName().toUpperCase().contains(name.toUpperCase()))
                .findFirst().orElse(null);
        if(client!=null){
            clientsList.remove(client);
        }
    }

    public Client clientExistance(String name){
        Client client= clientsList.stream().filter(f-> f.getName().toUpperCase().contains(name.toUpperCase()))
                .findFirst().orElse(null);
        return client;
    }

    public void showClients(){
        clientsList.stream().forEach(System.out::println);
    }

    ///Rental
    public void newRental(String clientName, String filmName, LocalDate returnDate){
        Film film= filmExistence(filmName);
        Client client= clientExistance(clientName);

        if(film != null && film.getQuantity()>0 && client !=null){
            film.setQuantity(film.getQuantity()-1);
            Rental rental= new Rental(film, client, returnDate);
            rentalsList.add(rental);
        }
    }

    public void currentRentals(){
        for(Rental rental : rentalsList){
            System.out.println(rental);
        }
    }

    public void returningRentals(){
        for(Rental rental : rentalsList){
            if(rental.getReturnDay().equals((LocalDate.now()))){
                System.out.println(rental);
            }
        }
    }

    public void last10Rentals(String name){
        rentalsList.sort((r1, r2) -> r1.getReturnDay().compareTo(r2.getReturnDay()));
        for(int i = 0; i < 10 && i < rentalsList.size(); i++)
        {
            Rental r = rentalsList.get(i);
            if(r.getClientsName().toUpperCase().contains(name.toUpperCase()))
                System.out.println(r.toString());
        }
    }

    public void showMostPopularFilmsByGenre(Gender gender)
    {
        filmsList.sort((f1, f2) -> f1.getRentRecord().compareTo(f2.getRentRecord()));
        List<Film> unitaryList = this.getUnitaryFilmList();
        unitaryList.forEach((f) -> {
            if(f.getGender() == gender)
                System.out.println(f.getTitle());
        });
    }

    private List<Film> getUnitaryFilmList()
    {
        List<Film> unitaryList = new ArrayList<>();
        filmsList.forEach(f -> {
            if(!unitaryList.stream().anyMatch(u -> u.getTitle() == f.getTitle()))
                unitaryList.add(f);
        });
        return unitaryList;
    }

    public void showMostRentedFilms()
    {
        filmsList.sort((f1, f2) -> f2.getRentRecord().compareTo(f1.getRentRecord()));
        List<Film> unitaryList = this.getUnitaryFilmList();

        for(int i = 0; i < 5 && i < unitaryList.size(); i++)
        {
            System.out.println(unitaryList.get(i).getTitle());
        }
    }
}
