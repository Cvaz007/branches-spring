package com.riwi.branch.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Bank {
    @EmbeddedId
    private BankId id;
    private Date dateFundation;

    public Bank() {
    }

    public Bank(BankId id, Date dateFundation) {
        this.id = id;

        this.dateFundation = dateFundation;
    }

    public BankId getId() {
        return id;
    }
    public void setId(BankId id) {
        this.id = id;
    }
    public Date getDateFundation() {
        return dateFundation;
    }

    public void setDateFundation(Date dateFundation) {
        this.dateFundation = dateFundation;
    }
}
