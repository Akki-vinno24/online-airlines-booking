package com.vinnovatelabz.airbooking.dao;

import com.vinnovatelabz.airbooking.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

    @Query("from Reservation r join fetch r.ticket t join fetch r.payment join fetch t.schedule sc join fetch sc.source join fetch sc.destination join fetch sc.plane pl " +
            "join fetch pl.airline join fetch r.passengers p join fetch p.seat s join fetch s.classes where t.pnr = ?1")
    Reservation getReservationDetails(int pnr);
}
