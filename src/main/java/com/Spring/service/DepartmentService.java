package com.Spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Spring.entity.Department;
import com.Spring.repository.DepartmentRepository;

@Service("departmentservice")
public class DepartmentService {
		
		@Autowired
		DepartmentRepository departmentrepository;
			
		public String adddepartment(Department departmentdetail) {
			System.out.println("HELLO"+departmentdetail.getDepartmentId());
			Department deptdetail = departmentrepository.findByDepartmentId(departmentdetail.getDepartmentId());
			if(deptdetail==null) {
			//	System.out.println("VENAM"+deptdetail.getDepartmentId()+departmentdetail.getDepartmentName()+departmentdetail.getNoOfEmployee()+departmentdetail.getManagerId());
				departmentrepository.save(departmentdetail);
			return "Details Have been successfully added.";
			}
			return null;
		}
		
		public List<Department> findalldepartment() {
			 List<Department> departmentList = (List<Department>) departmentrepository.findAll();

		        if (departmentList != null) {
		           return departmentList;
		        }

		       return null;
		}

}
