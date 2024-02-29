package com.riwi.branch.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Bank {
    @EmbeddedId
    private BankId id;
    @OneToMany
    private List<Branch> branches;
    private Date dateFundation;

    public Bank() {
    }

    public Bank(BankId id, List<Branch> branches, Date dateFundation) {
        this.id = id;
        this.branches = branches;
        this.dateFundation = dateFundation;
    }

    public Bank(Date dateFundation) {
        this.dateFundation = dateFundation;
    }
    public Date getDateFundation() {
        return dateFundation;
    }

    public void setDateFundation(Date dateFundation) {
        this.dateFundation = dateFundation;
    }
}
