package com.example.company.controller;

import com.example.company.model.Employee;
import com.example.company.service.EmployeeService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    //createEmployee

    //getAllEmployees
    @GetMapping("/")
    List<Employee> getAllEmployee() {

        List<Employee> list = employeeService.findAllEmployee();

        return list;
    }

    //getEmployeeByEcode
    @GetMapping("/{ecode}")
    Employee getEmployeeByEcode(@PathVariable("ecode") int ecode) {
        Employee e = employeeService.findEmployeeByEcode(ecode);
        return e;
    }


    //UpdateEmployee

    //DeleteEmployee

    //GetAllEmployeeNameAndContactNumbers

}
