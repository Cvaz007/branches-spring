package com.riwi.branch.repository;

import com.riwi.branch.models.Bank;
import com.riwi.branch.models.BankId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends BankIdRepository<Bank,BankId>{
}
