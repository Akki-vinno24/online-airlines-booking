package com.vinnovatelabz.airbooking.service;

import com.vinnovatelabz.airbooking.dao.ScheduleRepository;
import com.vinnovatelabz.airbooking.entity.Schedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    ScheduleRepository scheduleRepository;
    @Override
    public List<Schedule> getData(String source, String destination, String classType) {
        return scheduleRepository.getData(source, destination, classType);
    }
}
