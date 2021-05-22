package com.example.projet_jee.service;

import com.example.projet_jee.domain.chambre;
import com.example.projet_jee.exception.chambreNotFoundException;
import com.example.projet_jee.repositories.chambreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class chambreservice {
    @Autowired
    private final chambreRepo chambrerep;
    public chambreservice(chambreRepo chambrerep){this.chambrerep = chambrerep; }
    public chambre addchambre(@RequestBody chambre chambre) {
        return chambrerep.save(chambre);

    }
    public List<chambre> getAllchambre() {
        return chambrerep.findAll();
    }
    public chambre getchambreByIdc(int idc) {

        return chambrerep.findByIdC(idc).orElseThrow(() -> new chambreNotFoundException("chambre by ID " + idc + "was not found"));
    }
    public chambre Updatechambre(chambre chambre) {  return chambrerep.save(chambre); }

    /*public void deletechambre(int idC) {
        chambrerep.deletechambreByIdC(idC);
    }*/
}
