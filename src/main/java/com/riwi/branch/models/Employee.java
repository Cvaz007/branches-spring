package com.riwi.branch.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer code;
    @ManyToOne
    private Role rolId;
    @ManyToOne
    private Branch branchId;
    @Column(nullable = false, length = 35)
    private String name;
    private String genre;
    private String phoneNumber;
    private double salary;
    private int numberOfChildren;
    private Date dateOfBirth;

    public Employee() {
    }

    public Employee(Integer code, Role rolId, Branch branchId, String name, String genre, String phoneNumber, double salary, int numberOfChildren, Date dateOfBirth) {
        this.code = code;
        this.rolId = rolId;
        this.branchId = branchId;
        this.name = name;
        this.genre = genre;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.numberOfChildren = numberOfChildren;
        this.dateOfBirth = dateOfBirth;
    }

    public Branch getBranchId() {
        return branchId;
    }

    public void setBranchId(Branch branchId) {
        this.branchId = branchId;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Role getRolId() {
        return rolId;
    }

    public void setRolId(Role rolId) {
        this.rolId = rolId;
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

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
