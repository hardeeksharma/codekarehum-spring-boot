package com.example.company.model;

import java.util.ArrayList;
import java.util.List;


public class CompanyDB {
    List<Department> departments = new ArrayList<>();
    List<Employee> employees = new ArrayList<>();

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
