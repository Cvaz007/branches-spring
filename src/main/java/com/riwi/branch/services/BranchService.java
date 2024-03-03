package com.riwi.branch.services;

import com.riwi.branch.models.Branch;
import com.riwi.branch.repositories.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BranchService {
    @Autowired
    private BranchRepository branchRepository;

    public void saveBranch (Branch branch){
        branchRepository.save(branch);
    }

    public void deleteBranch(Integer id){
        branchRepository.deleteById(id);
    }

    public List<Branch> getAllBranches(){
        return branchRepository.findAll();
    }

    public Branch getBranchById(Integer id){
        return branchRepository.findById(id).get();
    }
}
