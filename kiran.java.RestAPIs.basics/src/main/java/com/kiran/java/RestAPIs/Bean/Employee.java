package com.kiran.java.RestAPIs.Bean;

public class Employee {
    private Integer Id;
    private String firstName;
    private String lastName;
    private String address;

    public Employee(Integer id, String firstName, String lastName, String address) {
        Id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
