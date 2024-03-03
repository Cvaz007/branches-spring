package com.riwi.branch.controllers;

import com.riwi.branch.models.Client;
import com.riwi.branch.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;
    @GetMapping("/client")
    public List<Client> getClientList() {
        return clientService.getAllClients();
    }
    @GetMapping("/client/{id}")
    public ResponseEntity<Client> getClientById(String id) {
        try {
            Client client = clientService.getClientById(id);
            return new ResponseEntity<Client>(client, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<Client>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/client")
    public void saveClient(@RequestBody Client client){
        clientService.saveClient(client);
    }
    @PutMapping("/client/{id}")
    public ResponseEntity<?> updateClient(@PathVariable String id, @RequestBody Client client){
        try {
            Client currentClient = clientService.getClientById(id);
            currentClient.setDirection(client.getDirection());
            currentClient.setGenre(client.getGenre());
            currentClient.setName(client.getName());
            currentClient.setSalary(client.getSalary());
            currentClient.setPhoneNumber(client.getPhoneNumber());

            clientService.saveClient(currentClient);
            return new ResponseEntity<Client>(HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<Client>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/client/{id}")
    public ResponseEntity<?> deleteClient(@PathVariable String id){
        try {
            Client client = clientService.getClientById(id);
            clientService.deleteClient(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception exception){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
