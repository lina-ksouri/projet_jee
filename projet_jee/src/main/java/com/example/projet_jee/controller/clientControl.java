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
    private static final Logger logger = LoggerFactory.getLogger(clientControl.class);

    @RequestMapping(method = RequestMethod.GET)
    public String test() {
        logger.info("Hello controller - test");
        return "Hello Controller - Test";
    }
    public clientControl(clientservice clientserv) {
        this.clientserv = clientserv;
    }

    @GetMapping("/getAllclient")
    public ResponseEntity<List<client>> getAll() {
        List<client> clients=  clientserv.getAllclient();
        return new ResponseEntity<>(clients, HttpStatus.OK);
    }

    @GetMapping("/getclient/{cin}")
    public ResponseEntity<client> getclientByCin(int cin1) {
        client clients=clientserv.getclientBycin(cin1);
        return new ResponseEntity<>(clients, HttpStatus.OK);
    }

    @PostMapping("/newclient")
    client newClient(@RequestBody client newClient){
        return clientserv.save(newClient);
    }

}
