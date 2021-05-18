package com.example.projet_jee.service;

import com.example.projet_jee.domain.client;
import com.example.projet_jee.domain.reservation;
import com.example.projet_jee.repositories.clientRepo;
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
    public String addreservation(@RequestBody reservation reserv) {
        reservrep.save(reserv);
        return "reservation ajoutée.";
    }
    public List<reservation> getAllreservation() {
        return reservrep.findAll();
    }
    public List<reservation> getreservByIdr(int idr1) {
        return reservrep.findByIdR(idr1);
    }
}
