package com.example.company.repository;

import com.example.company.model.CompanyDB;
import com.example.company.utils.MockDB;
import org.springframework.stereotype.Component;

//@Repository used when we connect to a read DB
@Component
public class EmployeeRepository {
    public CompanyDB getDB() {

        // Simulating Slow DB call
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return MockDB.getMockDB();
    }
}
