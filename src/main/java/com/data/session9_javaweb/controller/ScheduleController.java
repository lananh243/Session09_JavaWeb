package com.data.session9_javaweb.controller;

import com.data.session9_javaweb.model.Schedule;
import com.data.session9_javaweb.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ScheduleController {
    @Autowired
    private ScheduleRepository scheduleRepository;

    @GetMapping("/listSchedules")
    public String findAllScheduleByMovie(Model model) {
        List<Schedule> schedules = scheduleRepository.findAllScheduleByMovie();
        model.addAttribute("schedules", schedules);
        return "listSchedules";
    }
}
