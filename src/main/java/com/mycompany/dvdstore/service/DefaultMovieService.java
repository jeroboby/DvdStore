package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class DefaultMovieService implements MovieServiceInterface{

    @Autowired
    private MovieRepositoryInterface movieRepository;

    @Transactional
    public Movie registerMovie(Movie movie) {
        movieRepository.save(movie);
        return movie;
    }

    @Override
    public Iterable<Movie> getMovieList() {

        return movieRepository.findAll();
    }

    @Override
    public Movie getMovieById(long number) {
        Optional<Movie> optionalMovie = movieRepository.findById(number);
        if (optionalMovie.isEmpty()) {
            throw new NoSuchElementException();
        }
        Movie movie=optionalMovie.get();

        movie.getReviews().forEach(review ->
            review.setMovie(null)
        );

        return movie;
    }

    public MovieRepositoryInterface getMovieRepository() {
        return movieRepository;
    }

    public void setMovieRepository(MovieRepositoryInterface movieRepository) {
        this.movieRepository = movieRepository;
    }
}
