package com.riwi.branch.repository;

import com.riwi.branch.models.BranchWatchman;
import com.riwi.branch.models.BranchWatchmanId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchWatchmanRepository extends JpaRepository<BranchWatchman, BranchWatchmanId> {
}
