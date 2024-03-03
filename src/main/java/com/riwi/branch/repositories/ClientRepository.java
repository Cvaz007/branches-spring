package com.riwi.branch.repositories;

import com.riwi.branch.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,String> {
}
