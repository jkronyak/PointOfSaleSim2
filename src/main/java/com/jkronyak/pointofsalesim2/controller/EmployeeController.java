package com.jkronyak.pointofsalesim2.controller;

import com.jkronyak.pointofsalesim2.model.EmployeeModel;
import com.jkronyak.pointofsalesim2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(value="/")
    public ResponseEntity<List<EmployeeModel>> getAllEmployees() {
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    @GetMapping(value="/{employeeId}")
    public ResponseEntity<EmployeeModel> getEmployeeById(@PathVariable Long employeeId) {
        return ResponseEntity.ok(employeeService.getEmployeeById(employeeId));
    }

    @PostMapping(value="/")
    public ResponseEntity<EmployeeModel> createEmployee(@RequestBody EmployeeModel employeeModel) {
        return ResponseEntity.ok(employeeService.createEmployee(employeeModel));
    }

    @PutMapping(value="/{employeeId}")
    public ResponseEntity<EmployeeModel> updateEmployee(@PathVariable Long employeeId, @RequestBody EmployeeModel employeeModel) {
        return ResponseEntity.ok(employeeService.updateEmployee(employeeId, employeeModel));
    }

    @DeleteMapping(value="/{employeeId}")
    public ResponseEntity<Boolean> deleteEmployee(@PathVariable Long employeeId) {
        return ResponseEntity.ok(employeeService.deleteEmployee(employeeId));
    }


}
