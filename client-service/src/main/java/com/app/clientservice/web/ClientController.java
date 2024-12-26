package com.app.clientservice.web;


import com.app.clientservice.entities.Client;
import com.app.clientservice.repositories.ClientRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {

    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    ClientRepository clientRepository;
    @GetMapping("/clients")
    public List<Client> allClients(){
        return clientRepository.findAll();
    }


    @GetMapping("/clients/{id}")
    public Client aClient(@PathVariable  Long id){
        return clientRepository.findById(id).get();
    }


}


