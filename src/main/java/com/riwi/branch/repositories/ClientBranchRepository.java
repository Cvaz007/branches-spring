package com.riwi.branch.repositories;

import com.riwi.branch.models.ClientBranch;
import com.riwi.branch.models.ClientBranchId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientBranchRepository extends JpaRepository<ClientBranch, ClientBranchId> {
}
