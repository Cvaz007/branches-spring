package com.riwi.branch.models;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
@Embeddable
public class ClientBranchId implements Serializable {
    private String clientId;
    private Integer branchId;

    public ClientBranchId(String clientId, Integer branchId) {
        this.clientId = clientId;
        this.branchId = branchId;
    }

    public ClientBranchId() {
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }
}
