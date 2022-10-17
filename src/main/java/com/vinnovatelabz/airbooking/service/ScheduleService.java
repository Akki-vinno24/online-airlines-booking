package com.vinnovatelabz.airbooking.service;

import com.vinnovatelabz.airbooking.entity.Schedule;

import java.util.List;

public interface ScheduleService {
    List<Schedule> getData(String source, String destination, String classType);
}
