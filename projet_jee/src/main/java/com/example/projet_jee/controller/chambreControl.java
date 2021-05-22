package com.example.projet_jee.controller;

import com.example.projet_jee.domain.chambre;
import com.example.projet_jee.domain.reservation;
import com.example.projet_jee.service.chambreservice;
import com.example.projet_jee.service.reservationservice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class chambreControl {
    private final chambreservice chambreserv;

    public chambreControl(chambreservice chambreserv) {
        this.chambreserv = chambreserv;
    }

    @GetMapping("/getAllchambre")
    public ResponseEntity<List<chambre>> getAll() {
        List<chambre> chambres=  chambreserv.getAllchambre();
        return new ResponseEntity<>(chambres, HttpStatus.OK);
    }

    @GetMapping("/getchambre/{idC}")
    public ResponseEntity<chambre> getchambreByidC(@PathVariable("idC") int idC) {
        chambre chambres=chambreserv.getchambreByIdc(idC);
        return new ResponseEntity<>(chambres, HttpStatus.OK);
    }

    @PostMapping("/addchambre")
    public ResponseEntity<chambre> newchambre(@RequestBody chambre newchambre){
        chambre chambres = chambreserv.addchambre(newchambre);
        return new ResponseEntity<>(chambres, HttpStatus.CREATED);
    }
    @PutMapping("/updatechambre")
    public ResponseEntity<chambre> updatechambre(@RequestBody chambre Chambre){
        chambre chambres = chambreserv.Updatechambre(Chambre);
        return new ResponseEntity<>(chambres, HttpStatus.OK);
    }

   /* @DeleteMapping("/delete/{idC}")
    public ResponseEntity<?> deletechambre(@PathVariable("idC") int idC){
        chambreserv.deletechambre(idC);
        return new ResponseEntity<>( HttpStatus.OK);
    }*/
}
