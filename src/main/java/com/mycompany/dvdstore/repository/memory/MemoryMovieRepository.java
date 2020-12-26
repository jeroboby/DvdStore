package com.mycompany.dvdstore.repository.memory;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//@Repository
public class MemoryMovieRepository implements MovieRepositoryInterface {

    List<Movie> movies = new ArrayList<Movie>();
    private static long lastNumber = 0;

    public Movie add(Movie movie) {
        movie.setId(Long.valueOf(++lastNumber));
        movies.add(movie);
        System.out.println("The movie "+movie.getTitle()+ " has been added.");
        return movie;
    }


    public List<Movie> list() {
        return movies;
    }


    public Optional<Movie> findById(long id) {
        return movies.stream().
                filter(m -> m.getId()==id).
                findFirst();
    }

    @Override
    public <S extends Movie> S save(S s) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <S extends Movie> Iterable<S> saveAll(Iterable<S> iterable) {
        throw new UnsupportedOperationException();

    }

    @Override
    public Optional<Movie> findById(Long aLong) {
        throw new UnsupportedOperationException();

    }

    @Override
    public boolean existsById(Long aLong) {
        throw new UnsupportedOperationException();

    }

    @Override
    public Iterable<Movie> findAll() {
        throw new UnsupportedOperationException();

    }

    @Override
    public Iterable<Movie> findAllById(Iterable<Long> iterable) {
        throw new UnsupportedOperationException();

    }

    @Override
    public long count() {
        throw new UnsupportedOperationException();

    }

    @Override
    public void deleteById(Long aLong) {
        throw new UnsupportedOperationException();

    }

    @Override
    public void delete(Movie movie) {
        throw new UnsupportedOperationException();

    }

    @Override
    public void deleteAll(Iterable<? extends Movie> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteAll() {
        throw new UnsupportedOperationException();

    }
}
