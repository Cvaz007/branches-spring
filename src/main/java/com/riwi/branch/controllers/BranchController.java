package com.riwi.branch.controllers;

import com.riwi.branch.models.Branch;
import com.riwi.branch.services.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BranchController {
    @Autowired
    private BranchService branchService;

    @GetMapping("/branch")
    public List<Branch> getAllBranches() {
        return branchService.getAllBranches();
    }
    @GetMapping("/branch/{id}")
    public ResponseEntity<Branch> getBranchById (@PathVariable Integer id){
        try {
            Branch branch = branchService.getBranchById(id);
            return new ResponseEntity<Branch>(branch, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("/branch/{id}")
    public ResponseEntity<?> updateBranch(@PathVariable Integer id, @RequestBody Branch branch){
        try {
            Branch currrentBranch = branchService.getBranchById(id);
            currrentBranch.setlocation(branch.getLocation());
            currrentBranch.setPhoneNumber(branch.getPhoneNumber());
            currrentBranch.setBankId(branch.getBankId());
            currrentBranch.setCity(branch.getCity());

            branchService.saveBranch(currrentBranch);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/branch")
    public void saveBranch(@RequestBody Branch branch){
        branchService.saveBranch(branch);
    }
    @DeleteMapping("/branch/{id}")
    public ResponseEntity<?> deleteBranch(@PathVariable Integer id){
        try {
            Branch currentBranch = branchService.getBranchById(id);
            branchService.deleteBranch(id);

            return new ResponseEntity<>(HttpStatus.OK);
        }catch ( Exception e ){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
