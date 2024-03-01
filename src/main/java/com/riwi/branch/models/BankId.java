package com.riwi.branch.models;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
@Embeddable
public class BankId implements Serializable {
    private Integer code;
    private String name;

    public BankId() {
    }

    public BankId(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
