package com.riwi.branch.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Client {
    @Id
    private String AccountNumber;
    @OneToMany
    private List<ClientBranch> clientBranches;
    private String name;
    private String phoneNumber;
    private String direction;
    private String genre;
    private String salary;

    public Client() {
    }

    public Client(String accountNumber, List<ClientBranch> clientBranches, String name, String phoneNumber, String direction, String genre, String salary) {
        AccountNumber = accountNumber;
        this.clientBranches = clientBranches;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.direction = direction;
        this.genre = genre;
        this.salary = salary;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
