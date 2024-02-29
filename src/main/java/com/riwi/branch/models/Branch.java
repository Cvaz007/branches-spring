package com.riwi.branch.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer code;
    @OneToMany
    private List<ClientBranch> clientBranches;
    @ManyToOne
    private Bank bankId;
    @OneToMany
    private List<Employee> employees;
    @OneToMany
    private List<BranchWatchman> branchWatchman;
    @OneToMany
    private List<ATM> atms;
    private String city;
    private  String phoneNumber;
    private String location;

    public Branch() {
    }

    public Branch(Integer code, List<ClientBranch> clientBranches, Bank bankId, List<Employee> employees, List<BranchWatchman> branchWatchman, List<ATM> atms, String city, String phoneNumber, String location) {
        this.code = code;
        this.clientBranches = clientBranches;
        this.bankId = bankId;
        this.employees = employees;
        this.branchWatchman = branchWatchman;
        this.atms = atms;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }

    public List<ClientBranch> getClientBranches() {
        return clientBranches;
    }

    public void setClientBranches(List<ClientBranch> clientBranches) {
        this.clientBranches = clientBranches;
    }

    public List<BranchWatchman> getBranchWatchman() {
        return branchWatchman;
    }

    public void setBranchWatchman(List<BranchWatchman> branchWatchman) {
        this.branchWatchman = branchWatchman;
    }

    public List<ATM> getAtms() {
        return atms;
    }

    public void setAtms(List<ATM> atms) {
        this.atms = atms;
    }

    public Bank getBankId() {
        return bankId;
    }

    public void setBankId(Bank bankId) {
        this.bankId = bankId;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getlocation() {
        return location;
    }

    public void setlocation(String location) {
        this.location = location;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
