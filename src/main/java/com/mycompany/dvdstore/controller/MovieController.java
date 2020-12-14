package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class MovieController {
    @Autowired
    MovieServiceInterface movieService;

    public void addUsingConsole() {
        System.out.println( "Veuillez saisir le titre du film :" );
        Scanner sc = new Scanner(System.in);
        String movieName=sc.nextLine();
        System.out.println("Veuillez saisir le genre du film :");
        String movieGenre = sc.nextLine();
        Movie movie = new Movie();
        movie.setTitle(movieName);
        movie.setGenre(movieGenre);
        movieService.registryMovie(movie);
    }

    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }
}
