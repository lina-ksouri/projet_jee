package com.example.projet_jee.controller;


import com.example.projet_jee.domain.reservation;
import com.example.projet_jee.service.reservationservice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class reservationControl {
    private final reservationservice reservserv;

    public reservationControl(reservationservice reservserv) {
        this.reservserv = reservserv;
    }

    @GetMapping("/getAllReserv")
    public ResponseEntity<List<reservation>> getAll() {
        List<reservation> reservations=  reservserv.getAllreservation();
        return new ResponseEntity<>(reservations, HttpStatus.OK);
    }

    @GetMapping("/getreservation/{idr}")
    public ResponseEntity<reservation> getreservationByidr(@PathVariable("idr") int idr) {
        reservation reservations=reservserv.getreservByIdr(idr);
        return new ResponseEntity<>(reservations, HttpStatus.OK);
    }

    @PostMapping("/addreservation")
    public ResponseEntity<reservation> newreservation(@RequestBody reservation newreservation){
        reservation reservations = reservserv.addreservation(newreservation);
        return new ResponseEntity<>(reservations, HttpStatus.CREATED);
    }
    @PutMapping("/updatereservation")
    public ResponseEntity<reservation> updateReservation(@RequestBody reservation Reservation){
        reservation reservations = reservserv.UpdateReservation(Reservation);
        return new ResponseEntity<>(reservations, HttpStatus.OK);
    }

   /* @DeleteMapping("/delete/{idr}")
    public ResponseEntity<?> deleteReservation(@PathVariable("idr") int idr){
        reservserv.deletereservation(idr);
        return new ResponseEntity<>( HttpStatus.OK);
    }*/

}

