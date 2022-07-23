package com.jkronyak.pointofsalesim2.controller;

import com.jkronyak.pointofsalesim2.model.EmployeeModel;
import com.jkronyak.pointofsalesim2.repository.EmployeeRepository;
import com.jkronyak.pointofsalesim2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(value="/")
    public ResponseEntity<List<EmployeeModel>> getAllEmployees() {
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    @GetMapping(value="/{employeeId}")
    public ResponseEntity<EmployeeModel> getEmployeeById(@PathVariable Integer employeeId) {
        return ResponseEntity.ok(employeeService.getEmployeeById(employeeId));
    }

    @PostMapping(value="/")
    public ResponseEntity<EmployeeModel> createEmployee(@RequestBody EmployeeModel employeeModel) {
        return ResponseEntity.ok(employeeService.createEmployee(employeeModel));
    }



}
