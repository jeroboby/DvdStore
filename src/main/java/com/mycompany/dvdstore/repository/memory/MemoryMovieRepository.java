package com.mycompany.dvdstore.repository.memory;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;

import java.util.ArrayList;
import java.util.List;

//@Repository
public class MemoryMovieRepository implements MovieRepositoryInterface {

    List<Movie> movies = new ArrayList<Movie>();
    private static long lastNumber = 0;

    public void add(Movie movie) {
        movie.setId(Long.valueOf(++lastNumber));
        movies.add(movie);
        System.out.println("The movie "+movie.getTitle()+ " has been added.");
    }

    @Override
    public List<Movie> list() {
        return movies;
    }

    @Override
    public Movie getById(long id) {
        return movies.stream().
                filter(m -> m.getId()==id).
                findFirst().get();
    }
}
