package com.jkronyak.pointofsalesim2.service;

import com.jkronyak.pointofsalesim2.exception.EmployeeNotFoundException;
import com.jkronyak.pointofsalesim2.model.EmployeeModel;
import com.jkronyak.pointofsalesim2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<EmployeeModel> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public EmployeeModel getEmployeeById(Long employeeId) {
        return employeeRepository.findById(employeeId).orElseThrow(() -> new EmployeeNotFoundException("No employee found with id: " + employeeId));
    }

    public EmployeeModel createEmployee(EmployeeModel employeeModel) {
        return employeeRepository.save(employeeModel);
    }

    public EmployeeModel updateEmployee(Long employeeId, EmployeeModel employeeModel) {
        EmployeeModel foundEmployeeModel = employeeRepository.findById(employeeId).orElseThrow(() -> new EmployeeNotFoundException("No employee found with id: " + employeeId));
        foundEmployeeModel.setFirstName(employeeModel.getFirstName());
        foundEmployeeModel.setLastName(employeeModel.getLastName());
        foundEmployeeModel.setRole(employeeModel.getRole());
        return employeeRepository.save(foundEmployeeModel);
    }

    public Boolean deleteEmployee(Long employeeId) {
        employeeRepository.findById(employeeId).orElseThrow(() -> new EmployeeNotFoundException("No employee found with id: " + employeeId));
        employeeRepository.deleteById(employeeId);
        return true;
    }


}
