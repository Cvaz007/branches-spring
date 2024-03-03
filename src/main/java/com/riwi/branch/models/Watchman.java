package com.riwi.branch.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Watchman {
    @Id
    private String identificationNumber;
    @Column(nullable = false, length = 35)
    private  String name;
    private String genre;
    private String phoneNumber;
    private double salary;

    public Watchman() {
    }

    public Watchman(String identificationNumber, String name, String genre, String phoneNumber, double salary) {
        this.identificationNumber = identificationNumber;
        this.name = name;
        this.genre = genre;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
