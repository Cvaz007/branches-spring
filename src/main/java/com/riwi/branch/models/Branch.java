package com.riwi.branch.models;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.List;

@Entity
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer code;
    @ManyToOne
    private Bank bankId;
    @Column(nullable = false, length = 35)
    @NotNull
    private String city;
    private  String phoneNumber;
    @Column(nullable = false, length = 35)
    @NotNull
    private String location;

    public Branch() {
    }

    public Branch(Integer code, Bank bankId, String city, String phoneNumber, String location) {
        this.code = code;
        this.bankId = bankId;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }

    public Bank getBankId() {
        return bankId;
    }

    public void setBankId(Bank bankId) {
        this.bankId = bankId;
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
