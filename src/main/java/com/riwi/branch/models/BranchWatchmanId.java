package com.riwi.branch.models;

import jakarta.persistence.Embeddable;


import java.io.Serializable;

@Embeddable
public class BranchWatchmanId implements Serializable {
    private String watchmanId;
    private Integer branchId;
    public BranchWatchmanId() {
    }

    public BranchWatchmanId(String watchmanId, Integer branchId) {
        this.watchmanId = watchmanId;
        this.branchId = branchId;
    }

    public String getWatchmanId() {
        return watchmanId;
    }

    public void setWatchmanId(String watchmanId) {
        this.watchmanId = watchmanId;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }
}
