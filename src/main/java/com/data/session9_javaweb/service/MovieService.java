package com.data.session9_javaweb.service;

import com.data.session9_javaweb.model.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> findAllMovies();
    Movie findMovieById(Long id);
}
