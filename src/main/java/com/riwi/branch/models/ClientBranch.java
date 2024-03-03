package com.riwi.branch.models;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity
public class ClientBranch {
    @EmbeddedId
    private ClientBranchId id;
    @ManyToOne
    private Client clientId;
    @ManyToOne
    private Branch branchId;
    private Date durationDate;

    public ClientBranch() {
    }

    public ClientBranch(ClientBranchId id, Client client, Branch branch, Date durationDate) {
        this.id = id;
        this.clientId = client;
        this.branchId = branch;
        this.durationDate = durationDate;
    }

    public ClientBranchId getId() {
        return id;
    }

    public void setId(ClientBranchId id) {
        this.id = id;
    }

    public Client getClient() {
        return clientId;
    }

    public void setClient(Client client) {
        this.clientId = client;
    }

    public Branch getBranch() {
        return branchId;
    }

    public void setBranch(Branch branch) {
        this.branchId = branch;
    }

    public Date getDurationDate() {
        return durationDate;
    }

    public void setDurationDate(Date durationDate) {
        this.durationDate = durationDate;
    }
}
