package com.riwi.branch.repository;

import com.riwi.branch.models.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface branch extends JpaRepository<Branch,Integer> {
}
