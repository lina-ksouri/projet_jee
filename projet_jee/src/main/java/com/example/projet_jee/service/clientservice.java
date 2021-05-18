package com.example.projet_jee.service;

import com.example.projet_jee.domain.client;
import com.example.projet_jee.exception.UserNotFoundException;
import com.example.projet_jee.repositories.clientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

@Service
public class clientservice {
    private final clientRepo clientrep;
    @Autowired
    public clientservice(clientRepo clientrep){this.clientrep = clientrep; }
    public client addclient(@RequestBody client newClient) {
       return clientrep.save(newClient);

    }
    public List<client> getAllclient() {
        return clientrep.findAll();
    }
    public client getclientBycin(int cin1) {
        return clientrep.findByCin(cin1).orElseThrow(() -> new UserNotFoundException("client by CIN " + cin1 + "was not found"));
    }


    public client Updateclient(client client) {  return clientrep.save(client); }

    public void deleteclient(int cin1) {
        clientrep.deleteClientByCin(cin1);
    }
}

