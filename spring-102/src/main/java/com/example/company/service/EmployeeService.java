package com.example.company.service;

import com.example.company.model.Employee;
import com.example.company.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;

    public List<Employee> findAllEmployee() {
        return repository.getDB().getEmployees();
    }

    public Employee findEmployeeByEcode(int ecode) {
        List<Employee> employees = repository.getDB().getEmployees();
        return null;

    }
}
