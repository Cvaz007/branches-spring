package com.riwi.branch.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

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
