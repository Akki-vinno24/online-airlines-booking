package com.vinnovatelabz.airbooking.dao;

import com.vinnovatelabz.airbooking.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule, Integer> {

    @Query(value = "from Schedule sc join fetch sc.source s join fetch sc.destination d join fetch sc.plane p join fetch p.airline join fetch sc.fare f join fetch " +
            "f.classType c where s.city = ?1 and d.city = ?2 and c.classType = ?3")
    List<Schedule> getData(@Param("city") String source, @Param("city") String destination, @Param("classType") String classType);
}
