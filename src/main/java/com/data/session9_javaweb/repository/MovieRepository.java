package com.data.session9_javaweb.repository;

import com.data.session9_javaweb.model.Movie;

import java.util.List;

public interface MovieRepository {
    List<Movie> findAllMovies();
    Movie findMovieById(Long id);
}
