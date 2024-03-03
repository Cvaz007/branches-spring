package com.riwi.branch.services;

import com.riwi.branch.models.BranchWatchman;
import com.riwi.branch.models.BranchWatchmanId;
import com.riwi.branch.repositories.BranchWatchmanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class BranchWatchmanService {
    @Autowired
    private BranchWatchmanRepository branchWatchmanRepository;

    public void save(BranchWatchman branchWatchman){
        branchWatchmanRepository.save(branchWatchman);
    }
    public void delete(BranchWatchmanId id){
        branchWatchmanRepository.deleteById(id);
    }

    public BranchWatchman getBranchWatchmanById (BranchWatchmanId id){
        return branchWatchmanRepository.findById(id).get();
    }
}
