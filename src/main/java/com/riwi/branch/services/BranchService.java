package com.riwi.branch.services;

import com.riwi.branch.models.Branch;
import com.riwi.branch.repository.BranchRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BranchService {
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
