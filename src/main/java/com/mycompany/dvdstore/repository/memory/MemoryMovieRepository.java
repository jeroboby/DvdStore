package com.mycompany.dvdstore.repository.memory;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

//@Repository
public class MemoryMovieRepository implements MovieRepositoryInterface {

    List<Movie> movies = new ArrayList<Movie>();

    public void add(Movie movie) {
        movies.add(movie);
        System.out.println("The movie "+movie.getTitle()+ " has been added.");
    }
}
