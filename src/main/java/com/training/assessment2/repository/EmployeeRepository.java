package com.training.assessment2.repository;
import com.training.assessment2.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByEmpName(String empName);
    void deleteByEmpName(String empName);
}