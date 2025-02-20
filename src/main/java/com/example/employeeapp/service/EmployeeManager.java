package com.example.employeeapp.service;

import com.example.employeeapp.model.Employee;
import com.example.employeeapp.model.Employees;

import org.springframework.stereotype.Service;

@Service
public class EmployeeManager {
    private Employees employees;

    public EmployeeManager() {
        employees = new Employees();

        // Adding sample employees
        employees.addEmployee(new Employee("E001", "Alice", "Johnson", "alice@company.com", "Software Engineer"));
        employees.addEmployee(new Employee("E002", "Bob", "Smith", "bob@company.com", "Product Manager"));
        employees.addEmployee(new Employee("E003", "Charlie", "Brown", "charlie@company.com", "QA Engineer"));
    }

    public Employees getAllEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.addEmployee(employee);
    }
}
