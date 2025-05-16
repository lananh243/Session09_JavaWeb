package com.data.session9_javaweb.controller;

import com.data.session9_javaweb.model.Movie;
import com.data.session9_javaweb.model.Schedule;
import com.data.session9_javaweb.service.MovieService;
import com.data.session9_javaweb.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class MovieController {
    @Autowired
    private MovieService movieService;
    @Autowired
    private ScheduleService scheduleService;

    @GetMapping("/home")
    public String findAll(Model model) {
        List<Movie> movies = movieService.findAllMovies();
        model.addAttribute("movies", movies);
        return "home";
    }

    @GetMapping("detailMovie/{movieId}")
    public String findById(Model model,
                           @PathVariable Long movieId) {
        Movie movie = movieService.findMovieById(movieId);
        model.addAttribute("movie", movie);
        List<Schedule> schedules = scheduleService.getSchedulesByMovieId(movieId);
        model.addAttribute("schedules", schedules);

        return "detailMovie";
    }
}
