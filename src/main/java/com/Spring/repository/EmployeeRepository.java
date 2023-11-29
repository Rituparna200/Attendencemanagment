package com.Spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Spring.entity.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
   
    Employee findByEmployeeId(String employeeid);
    Employee findByEmployeeIdAndShift(String employeeid,String shift);

    Employee[] findByDepartment(String department);
    @Transactional
    void deleteByEmployeeId(String employeeId);

}
