package com.data.session9_javaweb.repository;

import com.data.session9_javaweb.model.Schedule;

import java.util.List;

public interface ScheduleRepository {
    List<Schedule> findAllScheduleByMovie();
    List<Schedule> getSchedulesByMovieId(Long movieId);
}
