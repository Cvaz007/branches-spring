package com.riwi.branch.repository;

import com.riwi.branch.models.ClientBranch;
import com.riwi.branch.models.ClientBranchId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientBranchRepository extends JpaRepository<ClientBranch, ClientBranchId> {
}
