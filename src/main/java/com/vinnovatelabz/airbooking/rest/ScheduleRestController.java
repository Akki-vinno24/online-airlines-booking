package com.vinnovatelabz.airbooking.rest;

import com.vinnovatelabz.airbooking.entity.Schedule;
import com.vinnovatelabz.airbooking.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ScheduleRestController {

    @Autowired
    private ScheduleService scheduleService;

    @GetMapping("/schedules/{source}/{destination}/{classType}")
    public List<Schedule> getSchedule(@PathVariable String source, @PathVariable String destination, @PathVariable String classType){
        return scheduleService.getData(source, destination, classType);
    }
}
