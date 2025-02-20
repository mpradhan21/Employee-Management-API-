package com.example.employeeapp.controller;

import com.example.employeeapp.model.Employee;
import com.example.employeeapp.model.Employees;
import com.example.employeeapp.service.EmployeeManager;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeManager employeeManager;

    public EmployeeController(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    // Get all employees
    @GetMapping
    public Employees getEmployees() {
        return employeeManager.getAllEmployees();
    }

    // Add a new employee
    @PostMapping
    public String addEmployee(@RequestBody Employee employee) {
        employeeManager.addEmployee(employee);
        return "Employee added successfully!";
    }
}
