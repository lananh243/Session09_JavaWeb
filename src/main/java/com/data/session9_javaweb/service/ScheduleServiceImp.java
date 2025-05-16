package com.data.session9_javaweb.service;

import com.data.session9_javaweb.model.Schedule;
import com.data.session9_javaweb.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ScheduleServiceImp implements ScheduleService{
    @Autowired
    private ScheduleRepository scheduleRepository;

    @Override
    public List<Schedule> findAllScheduleByMovie() {
        return scheduleRepository.findAllScheduleByMovie();
    }

    @Override
    public List<Schedule> getSchedulesByMovieId(Long movieId) {
        return scheduleRepository.getSchedulesByMovieId(movieId);
    }
}
