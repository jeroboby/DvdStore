package com.mycompany.dvdstore.repository;
/*
import com.mycompany.dvdstore.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

@Repository
public class MovieRepository  implements MovieRepositoryInterface {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Movie add(Movie movie) {
        KeyHolder kh = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO MOVIE(TITLE, GENRE, DESCRIPTION) VALUES (?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
                    ps.setString(1, movie.getTitle());
                    ps.setString(2, movie.getGenre());
                    ps.setString(3, movie.getDescription());
                    return ps;
        }, kh);

        movie.setId(kh.getKey().longValue());
        return movie;
    }

    @Override
    public List<Movie> list() {
        return jdbcTemplate.query("SELECT TITLE, GENRE, ID from MOVIE",
                (rs,rowNum) -> new Movie(rs.getString("TITLE"), rs.getString("GENRE"),rs.getLong("ID")));
    }

    @Override
    public Movie getById(long number) {
        return jdbcTemplate.queryForObject("SELECT TITLE, GENRE, ID, DESCRIPTION from MOVIE where ID = ?",
                new Object[]{number},
                (rs,rowNum) -> new Movie(rs.getString("TITLE"), rs.getString("GENRE"),rs.getLong("ID"), rs.getString("DESCRIPTION")));
    }
}
*/