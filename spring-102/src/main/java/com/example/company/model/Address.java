package com.example.company.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
    // PRIMARY KEY
    int id;
    String street;
    String city;
    int pinCode;
    String state;
}
