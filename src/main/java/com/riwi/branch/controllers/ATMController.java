package com.riwi.branch.controllers;

import com.riwi.branch.models.ATM;
import com.riwi.branch.services.ATMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ATMController {
    @Autowired
    private ATMService atmService;
    @GetMapping("/atm")
    public List<ATM> getATMList() {
        return atmService.getAllAtm();
    }
    @GetMapping("/atm/{id}")
    public ResponseEntity<ATM> getATMById(Integer id) {
        try {
            ATM atm = atmService.getAtmById(id);
            return new ResponseEntity<ATM>(atm, HttpStatus.OK);
        }catch (Exception e){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("/atm/{id}")
    public ResponseEntity<?> updateATM(@PathVariable Integer id,@RequestBody ATM atm) {
        try{
            ATM currentATM = atmService.getAtmById(id);
            //I must create a function for that, This function must be in services folder
            currentATM.setLocation(atm.getLocation());
            currentATM.setDeposit(atm.getDeposit());
            currentATM.setBranchId(atm.getBranchId());

            atmService.saveAtm(currentATM);

            return new ResponseEntity<ATM>(HttpStatus.OK);
        }catch (Exception e){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
