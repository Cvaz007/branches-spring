package com.riwi.branch.services;

import com.riwi.branch.models.Client;
import com.riwi.branch.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public void saveClient(Client client){
        clientRepository.save(client);
    }

    public void deleteClient(String id){
        clientRepository.deleteById(id);
    }

    public List<Client> getAllClients(){
        return clientRepository.findAll();
    }

    public Client getClientById(String id){
        return clientRepository.findById(id).get();
    }
}
