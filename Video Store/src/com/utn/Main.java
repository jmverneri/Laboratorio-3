package com.utn;

import java.time.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Film> filmList = new ArrayList<>();
        for(int i = 0; i < 5; i++)
            filmList.add(new Film("Harry Potter and the Chamber of Secrets",
                    LocalDate.of(2002, 11, 15),
                    240,
                    Audience.UNRATED,
                    "United Kingdom",
                    "The plot follows Harry's second year at Hogwarts School of Witchcraft and Wizardry, during which a series of messages on the walls of the school's corridors warn that the \"Chamber of Secrets\" has been opened and that the \"heir of Slytherin\" would kill all pupils who do not come from all-magical families.",
                    false,
                    Gender.ACCION,
                    0));
        for(int i = 0; i < 10; i++)
            filmList.add(new Film("Back to the Future",
                    LocalDate.of(1985, 7, 3),
                    117,
                    Audience.UNRATED,
                    "USA",
                    "Set in 1985, the story follows Marty McFly (Fox), a teenager accidentally sent back to 1955 in a time-traveling DeLorean automobile built by his eccentric scientist friend Doctor Emmett \"Doc\" Brown (Lloyd).",
                    false,
                    Gender.AVENTURA,
                    0));
        for(int i = 0; i < 7; i++)
            filmList.add(new Film("Superman: The Movie",
                    LocalDate.of(1978, 12, 10),
                    143,
                    Audience.UNRATED,
                    "USA",
                    "It depicts the origin of Superman (Reeve), including his infancy as Kal-El of Krypton, son of Jor-El (Brando) and his youthful years in the rural town of Smallville.",
                    false,
                    Gender.ACCION,
                    0));
        VideoStore videoStore = new VideoStore(filmList);
        videoStore.addClient(new Client("Ricardo Gutierrez", "441-5500", "Av Jara 2513"));
        videoStore.newRental("superman", "ricardo gutierrez", LocalDate.of(2021, 04, 25));
        videoStore.newRental("harry potter", "ricardo gutierrez", LocalDate.of(2021, 04, 25));
        System.out.println("Show ricardo gutierrez rents:");
        videoStore.last10Rentals("ricardo gutierrez");
        videoStore.addClient(new Client("Ana Gomez", "454-2200", "Av Pedro Luro 5401"));
        videoStore.newRental("superman", "ana gomez", LocalDate.of(2021, 04, 18));
        System.out.println("\nShow all active rents:");
        videoStore.showMostRentedFilms();
        System.out.println("\nShow return today rents:");
        videoStore.returningRentals();
        System.out.println("\nShow most rented films:");
        videoStore.showMostRentedFilms();
        System.out.println("\nShow most popular films by genre:");
        videoStore.showMostPopularFilmsByGenre(Gender.AVENTURA);
        System.out.println("\nShow film info (Harry Potter)");
        videoStore.showFilmInfo("harry potter");
    }
    }
}
