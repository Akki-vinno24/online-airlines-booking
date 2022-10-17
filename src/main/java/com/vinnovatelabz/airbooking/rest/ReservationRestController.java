package com.vinnovatelabz.airbooking.rest;

import com.vinnovatelabz.airbooking.entity.Reservation;
import com.vinnovatelabz.airbooking.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ReservationRestController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping("/reservations/{pnr}")
    public Reservation getReservationDetails(@PathVariable int pnr){
        return reservationService.getReservationDetails(pnr);
    }
}
