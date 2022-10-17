package com.vinnovatelabz.airbooking.service;

import com.vinnovatelabz.airbooking.entity.Reservation;

public interface ReservationService {
    Reservation getReservationDetails(int pnr);
}
