package com.Spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.entity.Employee;
import com.Spring.repository.EmployeeRepository;

@Service("EmployeeService")
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeerepository;
	

	 public String addUser(Employee employeedetail) {
     	System.out.println("PLSS1"+employeedetail.getShift());

		 	Employee empdetail = (Employee)employeerepository.findByEmployeeId(employeedetail.getEmployeeId());
	        if(empdetail==null) {
	        	System.out.println("PLSS"+employeedetail.getShift());
		 	employeerepository.save(employeedetail);
	        return "User account has been added";
	        }
	        return null;
	    }
	 
	    public List<Employee> findAllUser() {
	    	List<Employee> employeeList = (List<Employee>) employeerepository.findAll();

	        if (employeeList != null) {
	        	return employeeList;
	        }
	        return null;
	    }

	    
	    public String findByempdept(String employeeid) {
			 Employee employee = (Employee) employeerepository.findByEmployeeId(employeeid);

			  if (employee != null) {
		           return employee.getDepartment();
		        }

		        return null;
		  }
	    
	    public Employee[] findBydeptemp(String department) {
			 Employee[] employee = (Employee[]) employeerepository.findByDepartment(department);

			  if (employee != null) {
		           return employee;
		        }

		        return null;
		  }
	    
	    public Employee findByempid(String employeeid,String shift) {
		 Employee employee = (Employee) employeerepository.findByEmployeeIdAndShift(employeeid,shift);

		  if (employee != null) {
	           return employee;
	        }

	        return null;
	  }



	    public String deleteByEmpid(String employeeid) {
	    	employeerepository.deleteByEmployeeId(employeeid);
	        return "User data has been deleted successfully.";

	    }

}
