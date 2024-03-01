package com.riwi.branch.services;

import com.riwi.branch.models.Bank;
import com.riwi.branch.models.BankId;
import com.riwi.branch.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankService {
    @Autowired
    private BankRepository bankRepository;

    public List<Bank> getAllBanks(){
        return bankRepository.findAll();
    }

    public Bank getBankById(BankId id){
        return bankRepository.findById(id).get();
    }

    public void saveBank(Bank bank){
        bankRepository.save(bank);
    }

    public void deleteBank(BankId id){
        bankRepository.deleteById(id);
    }
}
