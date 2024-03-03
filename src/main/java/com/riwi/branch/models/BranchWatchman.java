package com.riwi.branch.models;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

import java.util.Date;
@Entity
public class BranchWatchman {
    @EmbeddedId
    private BranchWatchmanId id;
    @ManyToOne
    private Watchman watchmanId;
    @ManyToOne
    private  Branch branchId;
    private Date newsDate;

    public BranchWatchman() {
    }

    public BranchWatchman(BranchWatchmanId id, Watchman watchmanId, Branch branchId, Date newsDate) {
        this.id = id;
        this.watchmanId = watchmanId;
        this.branchId = branchId;
        this.newsDate = newsDate;
    }

    public BranchWatchmanId getId() {
        return id;
    }

    public void setId(BranchWatchmanId id) {
        this.id = id;
    }

    public Date getNewsDate() {
        return newsDate;
    }

    public void setNewsDate(Date newsDate) {
        this.newsDate = newsDate;
    }
}
