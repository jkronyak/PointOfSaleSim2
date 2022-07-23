package com.jkronyak.pointofsalesim2.service;

import com.jkronyak.pointofsalesim2.model.EmployeeModel;
import com.jkronyak.pointofsalesim2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<EmployeeModel> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public EmployeeModel getEmployeeById(Integer employeeId) {
        return employeeRepository.findById(employeeId).orElse(null);
    }

    public EmployeeModel createEmployee(EmployeeModel employeeModel) {
        return employeeRepository.save(employeeModel);
    }


}
