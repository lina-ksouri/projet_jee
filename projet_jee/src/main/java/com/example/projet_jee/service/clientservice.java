package com.example.projet_jee.service;

import com.example.projet_jee.domain.client;
import com.example.projet_jee.repositories.clientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class clientservice {
    private final clientRepo clientrep;
    @Autowired
    public clientservice(clientRepo clientrep){this.clientrep = clientrep; }
    public String addclient(@RequestBody client CL) {
        clientrep.save(CL);
        return "client added..";
    }
    public List<client> getAllclient() {
        return clientrep.findAll();
    }
    public client getclientBycin(int cin1) {
        return clientrep.findByCin(cin1);
    }

    public client save(client newClient) { return clientrep.save(newClient); }
}

