package com.riwi.branch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface ClientBranchIdRepository <T,ID extends Serializable> extends JpaRepository<T,ID> {
}
