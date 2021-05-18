package com.example.projet_jee.service;

import com.example.projet_jee.domain.reservation;
import com.example.projet_jee.exception.ReservationNotFoundException;
import com.example.projet_jee.repositories.reservationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@Service
public class reservationservice {

    private final reservationRepo reservrep;
    @Autowired
    public reservationservice(reservationRepo reservrep){this.reservrep = reservrep; }
    public reservation addreservation(@RequestBody reservation reserv) {
        return reservrep.save(reserv);

    }
    public List<reservation> getAllreservation() {
        return reservrep.findAll();
    }
    public reservation getreservByIdr(int idr1) {

        return reservrep.findByIdR(idr1).orElseThrow(() -> new ReservationNotFoundException("reservation by ID " + idr1 + "was not found"));
    }
    public reservation UpdateReservation(reservation reserv) {  return reservrep.save(reserv); }

    public void deletereservation(int idR1) {
        reservrep.deletereservatinByIdR(idR1);
    }
}






