package com.riwi.branch.services;

import com.riwi.branch.models.ClientBranch;
import com.riwi.branch.models.ClientBranchId;
import com.riwi.branch.repository.ClientBranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientBranchService {
    @Autowired
    private ClientBranchRepository clientBranchRepository;
    public void save(ClientBranch clientBranch){
        clientBranchRepository.save(clientBranch);
    }
    public void delete(ClientBranch id){
        clientBranchRepository.delete(id);
    }
    public ClientBranch getById(ClientBranchId id){
        return clientBranchRepository.findById(id).get();
    }
    public List<ClientBranch> getAll(){
        return clientBranchRepository.findAll();
    }
}
