package com.example.projet_jee.controller;

import com.example.projet_jee.domain.client;
import com.example.projet_jee.service.clientservice;
import org.slf4j.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class clientControl {
    private final clientservice clientserv;

    public clientControl(clientservice clientserv) {
        this.clientserv = clientserv;
    }

    @GetMapping("/getAllclient")
    public ResponseEntity<List<client>> getAll() {
        List<client> clients=  clientserv.getAllclient();
        return new ResponseEntity<>(clients, HttpStatus.OK);
    }

    @GetMapping("/getclient/{cin}")
    public ResponseEntity<client> getclientByCin(@PathVariable("cin") int cin1) {
        client clients=clientserv.getclientBycin(cin1);
        return new ResponseEntity<>(clients, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<client> newClient(@RequestBody client newClient){
        client clients = clientserv.addclient(newClient);
        return new ResponseEntity<>(clients, HttpStatus.CREATED);
    }
     @PutMapping("/update")
     public ResponseEntity<client> updateClient(@RequestBody client Client){
         client clients = clientserv.Updateclient(Client);
         return new ResponseEntity<>(clients, HttpStatus.OK);
     }

    @DeleteMapping("/delete/{cin}")
    public ResponseEntity<?> deleteClient(@PathVariable("cin") int cin1){
        clientserv.deleteclient(cin1);
        return new ResponseEntity<>( HttpStatus.OK);
    }


}
