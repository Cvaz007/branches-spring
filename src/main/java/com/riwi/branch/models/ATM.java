package com.riwi.branch.models;

import jakarta.persistence.*;

@Entity
public class ATM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer number;
    @ManyToOne
    private Branch branchId;
    @Column(nullable = false, length = 35)
    private String location;
    private String deposit;

    public ATM() {
    }

    public ATM(Integer number, Branch branchId, String location, String deposit) {
        this.number = number;
        this.branchId = branchId;
        this.location = location;
        this.deposit = deposit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }
}
