package com.example.company.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Employee {

    // PRIMARY KEY
    int ecode;
    String name;
    String email;
    int salary;
    String dob;
    String hireDate;

    //Employee has one address
    Address address;

    //Employee can have more than one contact numbers
    List<String> contact = new ArrayList<>();

    //Employee belongs to one  department
    Department department;

    //Employee can have more than one qualifications
    List<Qualification> qualifications = new ArrayList<>();
}
