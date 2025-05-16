package com.data.session9_javaweb.service;

import com.data.session9_javaweb.model.Schedule;

import java.util.List;

public interface ScheduleService {
    List<Schedule> findAllScheduleByMovie();
    List<Schedule> getSchedulesByMovieId(Long movieId);
}
