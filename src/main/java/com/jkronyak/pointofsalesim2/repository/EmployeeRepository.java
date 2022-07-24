package com.jkronyak.pointofsalesim2.repository;

import com.jkronyak.pointofsalesim2.model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeModel, Long> {
}
