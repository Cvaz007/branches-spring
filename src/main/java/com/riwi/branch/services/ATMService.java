package com.riwi.branch.services;

import com.riwi.branch.models.ATM;
import com.riwi.branch.repository.ATMRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ATMService {
    @Autowired
    private ATMRepository atmRepository;

    public List<ATM> getAllAtm() {
        return atmRepository.findAll();
    }

    public ATM getAtmById(Integer id) {
        return atmRepository.findById(id).get();
    }

    public void saveAtm(ATM atm){
        atmRepository.save(atm);
    }

    public void deleteAtm(Integer id){
        atmRepository.deleteById(id);
    }
}
