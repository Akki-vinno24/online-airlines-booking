package com.vinnovatelabz.airbooking.service;

import com.vinnovatelabz.airbooking.dao.ReservationRepository;
import com.vinnovatelabz.airbooking.entity.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public Reservation getReservationDetails(int pnr) {
        return reservationRepository.getReservationDetails(pnr);
    }
}
