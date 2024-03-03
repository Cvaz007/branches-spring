package com.riwi.branch.repositories;

import com.riwi.branch.models.Bank;
import com.riwi.branch.models.BankId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank, BankId> {
}
