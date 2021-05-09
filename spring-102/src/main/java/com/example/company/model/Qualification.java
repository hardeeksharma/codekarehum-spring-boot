package com.example.company.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Qualification {

    //PRIMARY KEY
    int id;
    String name;
    double percentage;
    String university;
    int passingYear;
}
