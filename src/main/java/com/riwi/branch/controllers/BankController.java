package com.riwi.branch.controllers;

import com.riwi.branch.models.Bank;
import com.riwi.branch.models.BankId;
import com.riwi.branch.services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BankController {
    @Autowired
    private BankService bankService;
    @GetMapping("/bank")
    public List<Bank> getBankList() {
        return bankService.getAllBanks();
    }
    @GetMapping("/bank/{id}/{name}")
    public ResponseEntity<Bank> getBankById(@PathVariable Integer id, @PathVariable String name) {
        BankId bankId = new BankId(id, name);
        try {
            Bank bank = bankService.getBankById(bankId);
            return new ResponseEntity<Bank>(bank,HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
    @PostMapping("/bank")
    public void saveBank(@RequestBody Bank bank) {
        bankService.saveBank(bank);
    }
    @DeleteMapping("/bank/{id}/{name}")
    public ResponseEntity<?> deleteBank(@PathVariable Integer id, @PathVariable String name) {
        BankId bankId = new BankId(id, name);
        try{
            Bank bank = bankService.getBankById(bankId);
            bankService.deleteBank(bankId);

            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("/bank/{id}/{name}")
    public ResponseEntity<Bank> updateBank(@PathVariable Integer id, @PathVariable String name, @RequestBody Bank bank) {
        BankId bankId = new BankId(id, name);
        try{
            Bank currentBank = bankService.getBankById(bankId);
            currentBank.setId(bank.getId());
            currentBank.setDateFundation(bank.getDateFundation());
            bankService.saveBank(currentBank);
            return new ResponseEntity<Bank>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Bank>(HttpStatus.NOT_FOUND);
        }
    }
}
