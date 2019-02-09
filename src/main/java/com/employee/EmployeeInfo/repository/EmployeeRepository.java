package com.employee.EmployeeInfo.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.EmployeeInfo.entity.Employee;
 
 
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
 
}